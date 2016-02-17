import static java.util.Arrays.*;

import java.util.*;

class State implements Comparable<State> {
	int h, w, cost;

	State(int h, int w, int c) {
		this.h = h;
		this.w = w;
		this.cost = c;
	}

	@Override
	public int compareTo(State o) {
		return cost - o.cost;
	}
}

public class WalkingHome {
	int[] dh = { 0, 0, 1, -1 };
	int[] dw = { 1, -1, 0, 0 };
	int H, W;
	char[][] town;

	public int fewestCrossings(String[] map) {
		H = map.length;
		W = map[0].length();
		town = new char[H][W];
		int sh = -1, sw = -1;
		for (int h = 0; h < H; h++) {
			town[h] = map[h].toCharArray();
			for (int w = 0; w < W; w++) {
				if (town[h][w] == 'S') {
					sh = h;
					sw = w;
				}
			}
		}
		return bfs(sh, sw);
	}

	int bfs(int sh, int sw) {
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.offer(new State(sh, sw, 0));
		boolean[][] vis = new boolean[H][W];
		while (!pq.isEmpty()) {
			State cur = pq.poll();
			if (town[cur.h][cur.w] == 'H') {
				return cur.cost;
			}
			if (vis[cur.h][cur.w])
				continue;
			vis[cur.h][cur.w] = true;
			for (int i = 0; i < dh.length; i++) {
				int nh = cur.h + dh[i], nw = cur.w + dw[i], ncost = cur.cost;
				if (!isValid(nh, nw) || town[nh][nw] == '*'
						|| town[nh][nw] == 'F' || vis[nh][nw]) {
					continue;
				}
				if ((town[cur.h][cur.w] == '|' && dw[i] == 0)
						|| (town[cur.h][cur.w] == '-' && dh[i] == 0))
					continue;

				if ((dw[i] == 0 && town[nh][nw] == '|')
						|| (dh[i] == 0 && town[nh][nw] == '-'))
					continue;
				// assert legal move is done
				if (isStreet(cur.h, cur.w) && !isStreet(nh, nw)) {
					ncost++;
				}
				pq.offer(new State(nh, nw, ncost));
			}
		}
		return -1;
	}

	boolean isStreet(int h, int w) {
		return town[h][w] == '|' || town[h][w] == '-';
	}

	boolean isValid(int h, int w) {
		return h >= 0 && h < H && w >= 0 && w < W;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
