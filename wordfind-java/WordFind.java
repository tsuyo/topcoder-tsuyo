import static java.util.Arrays.*;

import java.util.*;

public class WordFind {
	int R, C;
	char[][] W;

	public String[] findWords(String[] grid, String[] wordList) {
		R = grid.length;
		C = grid[0].length();
		W = new char[R][C];
		for (int r = 0; r < R; r++) {
			W[r] = grid[r].toCharArray();
		}
		List<String> list = new ArrayList<String>();
		for (String word : wordList) {
			boolean isFound = false;
			HERE: for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if (check(word, r, c)) {
						list.add(r + " " + c);
						isFound = true;
						break HERE;
					}
				}
			}
			if (!isFound) {
				list.add("");
			}
		}
		return list.toArray(new String[0]);
	}

	boolean check(String word, int r, int c) {
		char[] wc = word.toCharArray();
		int len = word.length();
		boolean vok = (r + len - 1 < R);
		boolean hok = (c + len - 1 < C);

		// check vertical
		if (vok) {
			boolean ok = true;
			for (int i = 0; i < len; i++) {
				if (W[i + r][c] != wc[i]) {
					ok = false;
					break;
				}
			}
			if (ok)
				return true;
		}
		// check horizotal
		if (hok) {
			boolean ok = true;
			for (int i = 0; i < len; i++) {
				if (W[r][i + c] != wc[i]) {
					ok = false;
					break;
				}
			}
			if (ok) {
				return true;
			}
		}
		// check diag
		if (hok && vok) {
			boolean ok = true;
			for (int i = 0; i < len; i++) {
				if (W[r + i][c + i] != wc[i]) {
					ok = false;
					break;
				}
			}
			if (ok)
				return true;
		}
		return false;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

	boolean isRange(int r, int c) {
		return r >= 0 && r < R && c >= 0 && c < C;
	}

}
