import static java.util.Arrays.*;

public class PalindromicSubstringsDiv2 {

	public int count(String[] S1, String[] S2) {
		StringBuilder sb = new StringBuilder();
		for (String s : S1)
			sb.append(s);
		for (String s : S2)
			sb.append(s);
		// max 5000 chars
		String S = sb.toString();
		return pa(S);
	}

	int pa(String str) {
		char[] ch = str.toCharArray();
		int N = ch.length;
		int cnt = 0;

		// a char is in the middle of palindrom
		for (int i = 0; i < N; i++) {
			int len = Math.min(i, N - 1 - i);
			for (int j = 0; j <= len; j++) {
				if (ch[i - j] == ch[i + j]) {
					cnt++;
				} else {
					break;
				}
			}
		}

		// a char and the next one are in the middle of a palindrom
		for (int i = 0; i < N; i++) {
			int len = Math.min(i, N - 1 - i - 1);
			for (int j = 0; j <= len; j++) {
				if (ch[i - j] == ch[i + j + 1]) {
					cnt++;
				} else {
					break;
				}
			}
		}
		return cnt;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
