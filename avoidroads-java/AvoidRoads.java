import static java.util.Arrays.*;

public class AvoidRoads {

	public long numWays(int width, int height, String[] bad) {
		long[][] dp = new long[width + 2][height + 2];
		boolean[][] badw = new boolean[width + 1][height + 2];
		boolean[][] badh = new boolean[width + 2][height + 1];
		initbad(bad, badw, badh);

		dp[1][0] = 1; // (0,0) -> dp[1][1]
		for (int w = 1; w <= width + 1; w++) {
			for (int h = 1; h <= height + 1; h++) {
				if (!badw[w - 1][h])
					dp[w][h] += dp[w - 1][h];
				if (!badh[w][h - 1])
					dp[w][h] += dp[w][h - 1];
			}
		}
		return dp[width + 1][height + 1];
	}

	void initbad(String[] bad, boolean[][] badw, boolean[][] badh) {
		for (String s : bad) {
			String[] ss = s.split(" ");
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			int c = Integer.parseInt(ss[2]);
			int d = Integer.parseInt(ss[3]);
			if (a == c) { // vertical
				int max = Math.max(b, d);
				badh[a + 1][max] = true;
			} else {
				int max = Math.max(a, c);
				badw[max][b + 1] = true;
			}
		}
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
