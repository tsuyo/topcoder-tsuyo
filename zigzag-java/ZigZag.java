import static java.util.Arrays.*;

public class ZigZag {
	int N;

	public int longestZigZag(int[] sequence) {
		N = sequence.length;
		// dp[0]: plus, dp[1]: minus
		int[][] dp = new int[N][2];
		dp[0][0] = dp[0][1] = 1;
		for (int i = 1; i < N; i++) {
			dp[i][0] = dp[i][1] = 1;
			for (int j = 0; j < i; j++) {
				// for plus
				if (sequence[i] > sequence[j]) {
					dp[i][0] = Math.max(dp[i][0], dp[j][1] + 1);
				}
				// for minus
				if (sequence[i] < sequence[j]) {
					dp[i][1] = Math.max(dp[i][1], dp[j][0] + 1);
				}
			}
		}
		return Math.max(dp[N - 1][0], dp[N - 1][1]);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
