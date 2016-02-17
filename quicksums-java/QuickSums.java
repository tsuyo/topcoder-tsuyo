import static java.util.Arrays.*;

public class QuickSums {
	int min = 20;
	int[] nums;

	public int minSums(String numbers, int sum) {
		nums = new int[numbers.length()];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = numbers.charAt(i) - '0';
		}
		check(sum, nums[0], 1, 0);
		return (min == 20) ? -1 : min;
	}

	void check(long sum, long x, int ind, int plus) {
		if (ind == nums.length) {
			sum -= x;
			if (sum == 0) {
				min = Math.min(min, plus);
			}
			return;
		}
		// not use plus
		check(sum, x * 10 + nums[ind], ind + 1, plus);
		// use plus
		check(sum - x, nums[ind], ind + 1, plus + 1);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
