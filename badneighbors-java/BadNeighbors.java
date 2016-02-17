import static java.util.Arrays.*;

public class BadNeighbors {
	int N;

	public int maxDonations(int[] donations) {
		N = donations.length;
		int[][] dp1 = new int[N][2];
		dp1[0][0] = donations[0];
		int[][] dp2 = new int[N][2];
		// try twice (#0 pays or not)
		return Math.max(don(true, dp1, donations), don(false, dp2, donations));
	}

	int don(boolean first, int[][] dp, int[] don) {
		for (int i = 1; i < N; i++) {
			dp[i][0] = dp[i - 1][1] + don[i];
			dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
		}
		return first ? dp[N - 1][1] : Math.max(dp[N - 1][0], dp[N - 1][1]);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
