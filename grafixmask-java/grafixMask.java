import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class grafixMask {
	boolean[] wall = new boolean[400 * 600];
	boolean[] visited = new boolean[400 * 600];
	int[][] diff = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public int[] sortedAreas(String[] rectangles) {
		for (String rec : rectangles) {
			String[] cols = rec.split(" ");
			int r1 = Integer.parseInt(cols[0]);
			int c1 = Integer.parseInt(cols[1]);
			int r2 = Integer.parseInt(cols[2]);
			int c2 = Integer.parseInt(cols[3]);
			for (int r = r1; r <= r2; r++) {
				for (int c = c1; c <= c2; c++) {
					wall[enc(r, c)] = true;
				}
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int r = 0; r < 400; r++) {
			for (int c = 0; c < 600; c++) {
				int rc = enc(r, c);
				if (!visited[rc] && !wall[rc]) {
					list.add(bfs(rc));
				}
			}
		}
		Collections.sort(list);
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}

	int bfs(int rc) {
		int total = 0;
		visited[rc] = true;
		total++;
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(rc);
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (int[] d : diff) {
				int[] pos = dec(cur);
				int nr = pos[0] + d[0];
				int nc = pos[1] + d[1];
				int newrc = enc(nr, nc);
				if (range(nr, nc) && !visited[newrc]) {
					visited[newrc] = true;
					total++;
					que.offer(newrc);
				}
			}
		}
		return total;
	}

	int enc(int r, int c) {
		return r * 600 + c;
	}

	boolean range(int r, int c) {
		return r >= 0 && r < 400 && c >= 0 && c < 600 && !wall[enc(r, c)];
	}

	int[] dec(int rc) {
		return new int[] { rc / 600, rc % 600 };
	}

}
