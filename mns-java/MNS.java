import static java.util.Arrays.*;

public class MNS {
	int[] numbers;
	int count;
	int sum; // sum of 3 numbers in the same row or col

	public int combos(int[] numbers) {
		this.numbers = numbers;
		int[] cnt = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			cnt[numbers[i]]++;
		}
		if (sum % 3 != 0)
			return 0;
		sum /= 3;
		dfs(0, new int[9], 0);
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] >= 2)
				count /= fact(cnt[i]);
		}
		return count;
	}

	// used: bitmap
	void dfs(int d, int[] square, int used) {
		if (d == 3 || d == 6) {
			if (!checkh(d - 3, square))
				return;
		}
		if (d >= 7) {
			if (!checkv(d - 7, square))
				return;
		}
		if (d == 9) {
			count++;
			return;
		}
		// find next
		for (int i = 0; i < 9; i++) {
			if (isUsed(i, used))
				continue;
			// use i
			square[d] = numbers[i];
			dfs(d + 1, square, use(i, used));
			// square[d] = -1;
		}
	}

	boolean checkv(int st, int[] square) {
		return square[st] + square[st + 3] + square[st + 6] == sum;
	}

	boolean checkh(int st, int[] square) {
		return square[st] + square[st + 1] + square[st + 2] == sum;
	}

	int fact(int i) {
		if (i == 1)
			return 1;
		return i * fact(i - 1);
	}

	boolean isUsed(int i, int used) {
		return (used & (1 << i)) != 0;
	}

	int use(int i, int used) {
		return (used | (1 << i));
	}

	// int unuse(int i, int used) {
	// return (used & (~(1 << i)));
	// }

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
