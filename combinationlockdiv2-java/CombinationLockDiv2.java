import java.util.*;

public class CombinationLockDiv2 {
	int N, MAXP;
	int[] diff; // 0-9 if the direction is up, how long does it take?
	int[][][] cache;

	public int minimumMoves(String S, String T) {
		char[] sch = S.toCharArray();
		char[] tch = T.toCharArray();
		N = sch.length;
		diff = new int[N];
		for (int i = 0; i < N; i++) {
			diff[i] = tch[i] - sch[i];
			if (diff[i] < 0) {
				diff[i] += 10;
			}
		}
		MAXP = 9 * N;
		cache = new int[N + 1][MAXP + 1][2];
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < MAXP + 1; j++) {
				Arrays.fill(cache[i][j], -1);
			}
		}
		return cost(0, 0, 0);
	}

	// cost for index >= p the sum of previous intervals' distance "d"
	// in direction (up == 0 means up)
	// this function is mapped to dp[][][] itself
	int cost(int p, int d, int up) {
		if (cache[p][d][up] != -1)
			return cache[p][d][up];
		if (p == N)
			return cache[p][d][up] = 0;
		// each possibility at index p
		// (how much distance and direction will you turn)
		int minc = Integer.MAX_VALUE;
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= MAXP; j++) {
				if (isValid(p, j, i)) {
					if (up != i) {
						minc = Math.min(minc, j + cost(p + 1, j, i));
					} else {
						// (1) d=6,j=4 (2) d=4,j=6
						if (d >= j) {
							minc = Math.min(minc, cost(p + 1, j, i));
						} else {
							minc = Math.min(minc, (j - d) + cost(p + 1, j, i));
						}
					}
				}
			}
		}
		return cache[p][d][up] = minc;
	}

	boolean isValid(int p, int d, int up) {
		int dmod10 = d % 10;
		return (up == 0) ? (dmod10 == diff[p])
				: (dmod10 == ((10 - diff[p]) % 10));
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
