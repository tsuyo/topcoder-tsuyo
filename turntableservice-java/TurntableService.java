import java.util.*;

class State implements Comparable<State> {
	int i, cost, sat;

	State(int i, int c, int s) {
		this.i = i;
		this.cost = c;
		this.sat = s;
	}

	@Override
	public int compareTo(State o) {
		return cost - o.cost;
	}
}

public class TurntableService {
	int N;
	int[] position; // table[0] means satisfied people in this position

	public int calculateTime(String[] favorites) {
		N = favorites.length;
		position = new int[N];
		int[] favbits = new int[N];
		for (int i = 0; i < N; i++) {
			for (String fs : favorites[i].split(" ")) {
				int myf = Integer.parseInt(fs);
				favbits[i] |= (1 << myf);
			}
			int rfav = rrot(favbits[i], i);
			for (int j = 0; j < N; j++) {
				position[j] |= (((rfav >> j) & 1) << i);
			}
		}
		return bfs();
	}

	int bfs() {
		boolean[][] vis = new boolean[N][1 << N];
		int max = (1 << N) - 1;
		Queue<State> que = new PriorityQueue<State>();
		que.offer(new State(0, 0, 0));
		while (!que.isEmpty()) {
			State cur = que.poll();
			if (cur.sat == max)
				return cur.cost;
			if (vis[cur.i][cur.sat])
				continue;
			vis[cur.i][cur.sat] = true;
			for (int ni = 0; ni < N; ni++) {
				int rotate = getRotate(cur.i, ni);
				// eat
				int nsat = eat(ni, cur.sat);
				// if nsat doesn't change, the following check will be skipped
				// (nothing happen)
				if (nsat != cur.sat && !vis[ni][nsat]) {
					int ncost = cur.cost + rotate + 1 + 15;
					que.offer(new State(ni, ncost, nsat));
				}
			}
		}
		return -1; // never reached here
	}

	int rrot(int bits, int dis) {
		int ret = (bits >> dis);
		ret |= ((bits & ((1 << dis) - 1)) << (N - dis));
		return ret;
	}

	int getRotate(int cur, int next) {
		int min = Math.min(cur, next);
		int max = Math.max(cur, next);
		int rotate = Math.min(max - min, min + N - max);
		rotate = (rotate == 0) ? -1 : rotate;
		return rotate;
	}

	// pos means dish 'pos' is in front of person[0]
	int eat(int pos, int sat) {
		return sat | position[pos];
	}

}
