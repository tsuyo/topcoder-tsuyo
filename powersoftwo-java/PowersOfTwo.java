import static java.util.Arrays.*;

import java.util.*;

public class PowersOfTwo {
	long[][] memo = new long[60][26];

	public long count(long[] powers) {
		for (int i = 0; i < memo.length; i++) {
			fill(memo[i], -1);
		}
		return count(powers, 0, 0);
	}

	long count(long[] powers, int idx, int carry) {
		if (memo[idx][carry] != -1)
			return memo[idx][carry];
		int cnt = find(powers, 1L << idx);

		if (idx == memo.length - 1)
			return 1;
		long ret = count(powers, idx + 1, (cnt + carry) / 2);
		if (cnt + carry > 0)
			ret += count(powers, idx + 1, (cnt + carry - 1) / 2);
		return memo[idx][carry] = ret;
	}

	int find(long[] powers, long num) {
		int cnt = 0;
		for (int i = 0; i < powers.length; i++) {
			if (powers[i] == num)
				cnt++;
		}
		return cnt;
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
