public class SlimeXSlimonadeTycoon {

	public int sell(int[] morning, int[] customers, int stale_limit) {
		int N = morning.length;
		int[] stock = new int[N];
		int sale = 0;
		for (int i = 0; i < N; i++) {
			stock[i] = morning[i];
			int now = 0;
			int start = Math.max(0, i - stale_limit + 1);
			for (int j = start; j <= i; j++) {
				int can = customers[i] - now;
				if (stock[j] >= can) {
					stock[j] -= can;
					now += can;
					break;
				} else {
					now += stock[j];
					stock[j] = 0;
				}
			}
			sale += now;
		}
		return sale;
	}

}
