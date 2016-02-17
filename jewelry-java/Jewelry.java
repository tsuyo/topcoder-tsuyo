import java.util.*;

public class Jewelry {
	final int MAXV = 30000;
	long[][] comb = new long[31][31];

	public long howMany(int[] values) {
		Arrays.sort(values);
		long ret = 0;
		int group = 1;
		for (int i = 0; i < values.length; i++) {
			if (i < values.length - 1 && values[i] == values[i + 1]) {
				group++;
				continue;
			}
			for (int g = 0; g < group; g++) {
				ret += comb(group, g + 1) * calc(values, i - group + 1, g);
			}
			group = 1;
		}
		return ret;
	}

	long calc(int[] values, int start, int g) {
		long[] dp1 = new long[MAXV + 1];
		long[] dp2 = new long[MAXV + 1];
		dp1[0] = dp2[0] = 1;
		// for dp1 (w/o values[p])
		for (int i = 0; i < start; i++) {
			for (int j = MAXV; j >= 1; j--) {
				if (j - values[i] >= 0)
					dp1[j] += dp1[j - values[i]];
			}
		}
		// for dp2
		for (int i = start + g + 1; i < values.length; i++) {
			for (int j = MAXV; j >= 1; j--) {
				if (j - values[i] >= 0)
					dp2[j] += dp2[j - values[i]];
			}
		}
		long ret = 0;
		int val = values[start] * (g + 1);
		for (int sum = 1; sum <= MAXV; sum++) {
			if (sum >= val)
				ret += dp1[sum - val] * dp2[sum];
		}
		return ret;
	}

	long comb(int n, int r) {
		if (comb[n][r] != 0)
			return comb[n][r];
		if (n == r || r == 0)
			return 1;
		return comb[n][r] = comb(n - 1, r) + comb(n - 1, r - 1);
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
