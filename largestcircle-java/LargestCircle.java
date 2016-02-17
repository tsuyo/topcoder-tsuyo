import static java.lang.Math.*;
import static java.util.Arrays.*;

public class LargestCircle {
	int R, C, RADMAX;
	char[][] G;

	public int radius(String[] grid) {
		R = grid.length;
		C = grid[0].length();
		RADMAX = max(R, C) / 2;
		G = new char[R][];
		for (int i = 0; i < R; i++) {
			G[i] = grid[i].toCharArray();
		}
		for (int rad = RADMAX; rad > 0; rad--) {
			for (int r = 1; r < R; r++) {
				for (int c = 1; c < C; c++) {
					if (check(r, c, rad)) {
						return rad;
					}
				}
			}
		}
		return 0;
	}

	// O(50^2)
	boolean check(int rc, int cc, int rad) {
		int rmin = min(abs(rc), abs(R - rc));
		int cmin = min(abs(cc), abs(C - cc));
		if (rmin < rad || cmin < rad)
			return false;
		// check grid
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				if (G[r][c] == '.')
					continue;
				int[] p = new int[4];
				p[0] = dist(rc, cc, r, c);
				p[1] = dist(rc, cc, r + 1, c);
				p[2] = dist(rc, cc, r, c + 1);
				p[3] = dist(rc, cc, r + 1, c + 1);
				int rsqu = rad * rad;
				if (findmin(p) < rsqu && findmax(p) > rsqu)
					return false;
			}
		}
		return true;
	}

	int findmax(int[] a) {
		int ret = -1;
		for (int i = 0; i < a.length; i++) {
			ret = max(ret, a[i]);
		}
		return ret;
	}

	int findmin(int[] a) {
		int ret = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			ret = min(ret, a[i]);
		}
		return ret;
	}

	int dist(int x1, int y1, int x2, int y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
