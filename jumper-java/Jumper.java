import static java.util.Arrays.*;

import java.util.*;

class State implements Comparable<State> {
	int r, c, t;

	State(int r, int c, int t) {
		this.r = r;
		this.c = c;
		this.t = t;
	}

	@Override
	public int compareTo(State o) {
		int dt = t - o.t;
		return (dt != 0) ? dt : o.r - r;
	}
}

public class Jumper {
	int R, C = 20;
	int[][] diff = { { 0, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	int[] sp, pad;

	public int minTime(String[] patterns, int[] speeds, String rows) {
		char[] rowchs = rows.toCharArray();
		R = 2 + rowchs.length;
		sp = new int[R];
		pad = new int[R];
		pad[0] = pad[R - 1] = ((1 << C) - 1);
		for (int r = 1; r < R - 1; r++) {
			int idx = rowchs[r - 1] - '0';
			sp[r] = speeds[idx];
			char[] pat = patterns[idx].toCharArray();
			int bits = 0;
			for (int i = 0; i < 5; i++) {
				if (pat[i] == '#')
					bits |= (1 << (4 - i));
			}
			for (int i = 0; i < 4; i++) {
				pad[r] |= (bits << (5 * i));
			}
		}
		// debug(sp);
		// for (int i = 0; i < R; i++) {
		// debug(Integer.toBinaryString(pad[i]));
		// debug(Integer.toBinaryString(rotate(pad[i], 3)));
		// }
		return search();
	}

	int search() {
		PriorityQueue<State> pq = new PriorityQueue<State>();
		boolean[][] visited = new boolean[R * C][20];
		pq.offer(new State(0, 0, 0));
		while (!pq.isEmpty()) {
			State cur = pq.poll();
			// debug(cur.r, cur.c, cur.t);
			if (cur.r == R - 1)
				return cur.t;
			if (visited[enc(cur.r, cur.c)][cur.t % 20])
				continue;
			visited[enc(cur.r, cur.c)][cur.t % 20] = true;
			for (int d = 0; d < diff.length; d++) {
				int jr = cur.r + diff[d][0], jc = cur.c + diff[d][1];
				if (!isValid(jr, jc) || !isValidPad(jr, jc, cur.t))
					continue;
				// update position
				int nr = jr, nc = jc + sp[jr], nt = (cur.t + 1);
				if (isValid(nr, nc) && !visited[enc(nr, nc)][nt % 20]) {
					pq.offer(new State(nr, nc, nt));
				}
			}
		}
		return -1;
	}

	int enc(int r, int c) {
		return r * C + c;
	}

	boolean isValid(int r, int c) {
		return (r >= 0 && r < R && c >= 0 && c < C);
	}

	boolean isValidPad(int r, int c, int t) {
		int shift = (sp[r] * t) % 20;
		if (shift < 0)
			shift += 20;
		int curpad = rotate(pad[r], shift);
		return (curpad & (1 << (C - 1 - c))) != 0;
	}

	int rotate(int org, int shift) {
		int mask = ((1 << shift) - 1);
		int ret = (org & mask);
		ret <<= (C - shift);
		ret += (org >> shift);
		return ret;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
