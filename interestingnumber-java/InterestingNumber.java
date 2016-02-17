public class InterestingNumber {

	public String isInteresting(String x) {
		int[] used = new int[10];
		char[] chs = x.toCharArray();
		boolean flag = true;
		for (int i = 0; i < chs.length; i++) {
			int cur = chs[i] - '0';
			if (used[cur] >= 2) {
				flag = false;
				break;
			}
			if (used[cur] == 0) {
				int pos = cur + i + 1;
				if (pos >= chs.length || chs[pos] != chs[i]) {
					flag = false;
					break;
				}
			}
			used[cur]++;
		}
		return flag ? "Interesting" : "Not interesting";
	}

}
