public class FoxAndSightseeing {

	public int getMin(int[] position) {
		int n = position.length;
		int total = 0;
		for (int i = 0; i <= n - 2; i++) {
			total += Math.abs(position[i + 1] - position[i]);
		}

		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= n - 2; i++) {
			int org = Math.abs(position[i + 1] - position[i])
					+ Math.abs(position[i] - position[i - 1]);
			int cur = Math.abs(position[i + 1] - position[i - 1]);
			min = Math.min(min, cur - org);
		}
		return total + min;
	}
}
