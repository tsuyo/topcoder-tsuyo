import static java.util.Arrays.*;

public class EllysCandyGame {
	int N;
	String[] msg = { "Elly", "Draw", "Kris" };

	public String getWinner(int[] sweets) {
		N = sweets.length;
		int res = point(sweets, 0, 0, 0);
		if (res > 0) {
			return msg[0];
		} else if (res == 0) {
			return msg[1];
		} else {
			return msg[2];
		}
	}

	int point(int[] sweets, int dep, int elly, int kris) {
		if (dep >= N || !check(sweets))
			return elly - kris;

		if ((dep & 1) == 0) { // elly turn
			int max = -1;
			for (int i = 0; i < N; i++) {
				if (sweets[i] == 0)
					continue;
				int val = sweets[i];
				take(sweets, i);
				int cur = point(sweets, dep + 1, elly + val, kris);
				back(sweets, i, val);
				max = Math.max(max, cur);
			}
			return max;
		} else {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				if (sweets[i] == 0)
					continue;
				int val = sweets[i];
				take(sweets, i);
				int cur = point(sweets, dep + 1, elly, kris + val);
				back(sweets, i, val);
				min = Math.min(min, cur);
			}
			return min;
		}
	}

	boolean check(int[] sweets) {
		for (int i = 0; i < N; i++) {
			if (sweets[i] != 0)
				return true;
		}
		return false;
	}

	void take(int[] sweets, int i) {
		if (i - 1 >= 0)
			sweets[i - 1] = 2 * sweets[i - 1];
		if (i + 1 < N)
			sweets[i + 1] = 2 * sweets[i + 1];
		sweets[i] = 0;
	}

	void back(int[] sweets, int i, int val) {
		if (i - 1 >= 0)
			sweets[i - 1] = sweets[i - 1] / 2;
		if (i + 1 < N)
			sweets[i + 1] = sweets[i + 1] / 2;
		sweets[i] = val;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
