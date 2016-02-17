import static java.util.Arrays.*;

public class WeirdRooks {
	int[] cols;
	int R, C, sum;

	public String describe(int[] cols) {
		this.cols = cols;
		R = cols.length;
		for (int c : cols) {
			sum += c;
			C = Math.max(C, c);
		}
		StringBuilder sb = new StringBuilder("0," + sum);
		// StringBuilder sb = new StringBuilder();
		boolean[][] set = new boolean[R + 1][81];
		place(set, sum, 0, 0, 0);
		for (int i = 1; i <= R; i++) {
			for (int j = 0; j < set[0].length; j++) {
				if (set[i][j]) {
					sb.append(" " + i + "," + j);
				}
			}
		}
		return sb.toString();
	}

	void place(boolean[][] set, int count, int rnum, int curr, int rcol) {
		set[rnum][count] = true;
		if (curr == R) {
			return;
		}
		// not placed
		place(set, count, rnum, curr + 1, rcol);
		// placed
		int canuse = ~rcol & ((1 << C) - 1);
		while (canuse != 0) {
			int usecol = canuse & (-canuse);
			if ((1 << cols[curr]) > usecol) {
				place(set, count - reduce(curr, rcol, usecol), rnum + 1,
						curr + 1, rcol | usecol);
			}
			canuse &= (canuse - 1);
		}
	}

	// rcol is a bitset
	int reduce(int curr, int rcol, int usecol) {
		int red = Integer.numberOfTrailingZeros(usecol) + 1;
		// remove upper square (including dup)
		for (int j = 0; j < curr; j++) {
			if ((1 << cols[j]) > usecol) {
				red += 1;
			}
		}
		// add back duplicated square
		red -= Integer.bitCount((-usecol) & rcol);
		return red;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
