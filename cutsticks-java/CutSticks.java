import java.util.*;

public class CutSticks {

	public double maxKth(int[] sticks, int C, int K) {
		int n = sticks.length;
		Arrays.sort(sticks);

		double L = 0;
		double H = 1000000000;
		for (int i = 0; i < 80; i++) {
			double val = (L + H) / 2;
			long k = 0;
			long c = 0;
			for (int j = 0; j < n; j++) {
				long add = (long) (sticks[j] / val);
				if (add >= 1) {
					k += add;
					c += (add - 1);
				}
			}
			if (c > C) {
				k -= (c - C);
			}
			if (k >= K) {
				L = val;
			} else {
				H = val;
			}
		}
		return (L + H) / 2;
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
