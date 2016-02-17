public class BettingMoney {

	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		int ret = 0;
		for (int i = 0; i < amounts.length; i++) {
			if (i == finalResult) {
				ret -= amounts[i] * centsPerDollar[i];
			} else {
				ret += amounts[i] * 100;
			}
		}
		return ret;
	}

}
