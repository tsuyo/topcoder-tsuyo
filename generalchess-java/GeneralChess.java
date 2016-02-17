import java.util.*;

public class GeneralChess {
	int R = 10010;
	int MAX = R * 2 + 1;
	int[][] diff = { { 2, 1 }, { 2, -1 }, { 1, 2 }, { 1, -2 }, { -2, 1 },
			{ -2, -1 }, { -1, 2 }, { -1, -2 } };

	public String[] attackPositions(String[] pieces) {
		// List<Integer> cand = new ArrayList<Integer>();
		Set<Integer> cand = new TreeSet<Integer>();
		for (int p = 0; p < pieces.length; p++) {
			String P = pieces[p];
			String[] cols = P.split(",");
			int x = Integer.parseInt(cols[0]);
			int y = Integer.parseInt(cols[1]);
			List<Integer> curCand = new ArrayList<Integer>();
			for (int dii = 0; dii < diff.length; dii++) {
				int[] di = diff[dii];
				int nx = x + di[0];
				int ny = y + di[1];
				int nxy = enc(nx, ny);
				// gather candidates
				if (p == 0) {
					cand.add(nxy);
				}
				curCand.add(nxy);
			}
			cand.retainAll(curCand);
		}
		// Collections.sort(cand);
		// String[] ret = new String[cand.size()];
		// for (int i = 0; i < ret.length; i++) {
		// int[] xy = dec(cand.get(i));
		// ret[i] = xy[0] + "," + xy[1];
		// }
		String[] ret = new String[cand.size()];
		int i = 0;
		for (int num : cand) {
			int[] xy = dec(num);
			ret[i++] = xy[0] + "," + xy[1];
		}
		return ret;
	}

	int enc(int x, int y) {
		return (x + R) * MAX + (y + R);
	}

	int[] dec(int xy) {
		return new int[] { xy / MAX - R, xy % MAX - R };
	}

	// boolean range(int x, int y) {
	// return x >= -10000 && x <= 10000 && y >= -10000 && y <= 10000;
	// }

}
