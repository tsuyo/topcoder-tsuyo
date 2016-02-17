import static java.util.Arrays.*;

import java.util.*;

class State implements Comparable<State> {
	int h, w;
	int door; // use LSB 10 bits for door states
	int cost;

	State(int h, int w, int d, int c) {
		this.h = h;
		this.w = w;
		this.door = d;
		this.cost = c;
	}

	public int compareTo(State o) {
		return cost - o.cost;
	}
}

public class RevolvingDoors {
	int H, W;
	char[][] maze;
	int[][] door; // is required?
	int[] dw = { 0, 0, 1, -1 };
	int[] dh = { 1, -1, 0, 0 };

	public int turns(String[] map) {
		H = map.length;
		W = map[0].length();
		maze = new char[H][W];
		int sh = 0, sw = 0;
		door = new int[H][W];
		int dstate = 0;
		int di = 1;

		for (int i = 0; i < H; i++) {
			maze[i] = map[i].toCharArray();
			for (int j = 0; j < W; j++) {
				if (maze[i][j] == 'S') {
					sh = i;
					sw = j;
				} else if (maze[i][j] == 'O') {
					if (maze[i - 1][j] == '|') {
						dstate |= (1 << di);
					}
					door[i][j - 1] = door[i][j + 1] = -di; // '-' == horizon
					door[i - 1][j] = door[i + 1][j] = di; // '-' == vertical
					di++;
				}
			}
		}
		return bfs(sh, sw, dstate);
	}

	int bfs(int sh, int sw, int dstate) {
		boolean[][][] isv = new boolean[H][W][1 << 11];
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.offer(new State(sh, sw, dstate, 0));

		while (!pq.isEmpty()) {
			State cur = pq.poll();
			if (isv[cur.h][cur.w][cur.door])
				continue;
			isv[cur.h][cur.w][cur.door] = true;
			if (maze[cur.h][cur.w] == 'E')
				return cur.cost;

			for (int i = 0; i < dh.length; i++) {
				int nh = cur.h + dh[i], nw = cur.w + dw[i];
				if (!isValid(nh, nw) || maze[nh][nw] == 'O'
						|| maze[nh][nw] == '#')
					continue;
				int nstate = cur.door, ncost = cur.cost;
				boolean nowv = ((cur.door & (1 << Math.abs(door[nh][nw]))) != 0);
				if (door[nh][nw] > 0 && nowv) {
					if (dh[i] == 0) {
						nstate ^= (1 << door[nh][nw]);
						ncost++;
					} else {
						continue;
					}
				} else if (door[nh][nw] < 0 && !nowv) {
					if (dh[i] != 0) {
						nstate |= (1 << -door[nh][nw]);
						ncost++;
					} else {
						continue;
					}
				}

				if (!isv[nh][nw][nstate])
					pq.offer(new State(nh, nw, nstate, ncost));
			}

		}
		return -1;
	}

	boolean isValid(int h, int w) {
		return h >= 0 && h < H && w >= 0 && w < W;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
