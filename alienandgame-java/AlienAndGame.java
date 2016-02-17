import static java.util.Arrays.*;

public class AlienAndGame {
	int R, C;
	long[] BD;

	public int getNumber(String[] board) {
		R = board.length;
		C = board[0].length();
		BD = new long[R];
		for (int r = 0; r < R; r++) {
			char[] ch = board[r].toCharArray();
			for (int c = 0; c < C; c++) {
				BD[r] <<= 1;
				if (ch[c] == 'W') {
					BD[r] |= 1;
				}
			}
		}

		int res = 1;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				int max = Math.min(R - r, C - c);
				for (int len = 1; len <= max; len++) {
					if (ok(r, c, len))
						res = Math.max(res, len);
				}
			}
		}
		return res * res;
	}

	boolean ok(int r, int c, int len) {
		long mask = ((1L << len) - 1);
		int good = 0;
		for (int i = r; i < r + len; i++) {
			int shift = C - (c + len);
			long res = ((BD[i] >> shift) & mask);
			if (res == 0 || res == mask) {
				good++;
			}
		}
		return good == len;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
