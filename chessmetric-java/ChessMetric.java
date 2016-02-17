import static java.util.Arrays.*;

public class ChessMetric {
	int N;
	int[][] D = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, -1 }, { -1, 0 },
			{ -1, 1 }, { -1, 2 }, { 0, -1 }, { 0, 1 }, { 1, -2 }, { 1, -1 },
			{ 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, -1 }, { 2, 1 } };

	public long howMany(int size, int[] start, int[] end, int numMoves) {
		N = size;
		long[][][] dp = new long[numMoves + 1][N][N];
		dp[0][start[0]][start[1]] = 1;
		for (int i = 1; i <= numMoves; i++) {
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					int[][] next = next(r, c);
					for (int[] pt : next) {
						if (!isRange(pt))
							continue;
						dp[i][pt[0]][pt[1]] += dp[i - 1][r][c];
					}
				}
			}
		}
		return dp[numMoves][end[0]][end[1]];
	}

	int[][] next(int r, int c) {
		int[][] next = new int[D.length][2];
		for (int i = 0; i < next.length; i++) {
			next[i][0] = r + D[i][0];
			next[i][1] = c + D[i][1];
		}
		return next;
	}

	boolean isRange(int[] pt) {
		return pt[0] >= 0 && pt[0] < N && pt[1] >= 0 && pt[1] < N;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
