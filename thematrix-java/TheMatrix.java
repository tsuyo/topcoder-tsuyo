import java.util.*;

public class TheMatrix {
	int R, C;
	int[][] maxr, maxc;
	String[] board;

	public int MaxArea(String[] board) {
		this.board = board;
		R = board.length;
		C = board[0].length();
		maxr = new int[R][C];
		maxc = new int[R][C];

		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				maxr[r][c] = maxc[r][c] = -1;
			}
		}

		int max = -1;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				int row = maxc(r, c);
				int minr = Integer.MAX_VALUE;
				for (int i = 0; i < row; i++) {
					minr = Math.min(minr, maxr(r + i, c));
					max = Math.max(max, (i + 1) * minr);
				}
			}
		}
		return max;
	}

	int maxr(int r, int c) {
		if (maxr[r][c] != -1)
			return maxr[r][c];
		if (c == C - 1)
			return maxr[r][c] = 1;

		char[] chs = board[r].toCharArray();
		int cand = 0;
		if (chs[c] == chs[c + 1]) {
			cand = 1;
		} else {
			cand = 1 + maxr(r, c + 1);
		}
		return maxr[r][c] = cand;
	}

	int maxc(int r, int c) {
		if (maxc[r][c] != -1)
			return maxc[r][c];
		if (r == R - 1)
			return 1;

		char[] ch1 = board[r].toCharArray();
		char[] ch2 = board[r + 1].toCharArray();
		int cand = 0;
		if (ch1[c] == ch2[c]) {
			cand = 1;
		} else {
			cand = 1 + maxc(r + 1, c);
		}
		return maxc[r][c] = cand;
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
