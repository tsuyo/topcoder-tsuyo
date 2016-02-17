public class ShortPalindromes {
	String[][] cache;
	char[] chs;

	public String shortest(String base) {
		this.chs = base.toCharArray();
		int N = base.length();
		cache = new String[N][N];
		return min(0, N - 1);
	}

	String min(int s, int t) {
		if (cache[s][t] != null)
			return cache[s][t];
		if (s > t)
			return cache[s][t] = "";
		if (s == t)
			return cache[s][t] = chs[s] + "";

		if (chs[s] == chs[t]) {
			return cache[s][t] = chs[s] + min(s + 1, t - 1) + chs[t];
		} else {
			String s1 = chs[s] + min(s + 1, t) + chs[s];
			String s2 = chs[t] + min(s, t - 1) + chs[t];
			String cand = null;
			if (s1.length() < s2.length()) {
				cand = s1;
			} else if (s1.length() > s2.length()) {
				cand = s2;
			} else {
				cand = (s1.compareTo(s2) < 0) ? s1 : s2;
			}
			return cache[s][t] = cand;
		}
	}
}
