import java.util.*;

public class StripePainter {
	int[][][] cache;
	char[] strchs;

	public int minStrokes(String stripes) {
		strchs = stripes.toCharArray();
		int N = stripes.length();
		cache = new int[N][N + 1][27];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N + 1; j++) {
				Arrays.fill(cache[i][j], -1);
			}
		}
		return min(0, N, 0); // 'A' - '@' = 1
	}

	int min(int from, int size, int cl) {
		if (size == 0)
			return 0;
		if (cache[from][size][cl] >= 0)
			return cache[from][size][cl];
		if (strchs[from] == i2c(cl)) {
			return cache[from][size][cl] = min(from + 1, size - 1, cl);
		} else {
			int min = Integer.MAX_VALUE;
			int curcl = c2i(strchs[from]);
			for (int sz = 0; sz <= size - 1; sz++) {
				min = Math.min(
						min,
						1 + min(from + 1, sz, curcl)
								+ min(from + 1 + sz, size - 1 - sz, cl));
			}
			return cache[from][size][cl] = min;
		}
	}

	int c2i(char c) {
		return c - 'A' + 1;
	}

	char i2c(int i) {
		return (char) ('A' + i - 1);
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}
}
