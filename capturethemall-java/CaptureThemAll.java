import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CaptureThemAll {
	int[][] diff = { { -2, -1 }, { -2, 1 }, { 2, -1 }, { 2, 1 }, { -1, -2 },
			{ 1, -2 }, { -1, 2 }, { 1, 2 } };

	public int fastKnight(String knight, String rook, String queen) {
		int K = enc(knight);
		int R = enc(rook);
		int Q = enc(queen);
		return Math.min(bfs(K, R) + bfs(R, Q), bfs(K, Q) + bfs(Q, R));
	}

	int bfs(int start, int end) {
		int[] dist = new int[64];
		Arrays.fill(dist, -1);
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(start);
		dist[start] = 0;
		while (!que.isEmpty()) {
			int cur = que.poll();
			if (cur == end)
				return dist[cur];
			int[] rc = conv(cur);
			for (int[] di : diff) {
				int newr = rc[0] + di[0];
				int newc = rc[1] + di[1];
				int newrc = newr * 8 + newc;
				if (!isRange(newr, newc) || dist[newrc] != -1)
					continue;
				que.offer(newrc);
				dist[newrc] = dist[cur] + 1;
			}
		}
		return -1; // never reached
	}

	int enc(String state) {
		char[] ch = state.toCharArray();
		int c = ch[0] - 'a';
		int r = ch[1] - '1';
		return r * 8 + c;
	}

	int[] conv(int enc) {
		int r = enc / 8;
		int c = enc % 8;
		return new int[] { r, c };
	}

	boolean isRange(int r, int c) {
		return 0 <= r && r < 8 && 0 <= c && c < 8;
	}

}
