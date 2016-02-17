import static java.util.Arrays.*;

public class WordForm {
	char[] chs;

	public String getSequence(String word) {
		chs = word.toCharArray();
		char prev = 'A';
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chs.length; i++) {
			char cur = isVowel(i) ? 'V' : 'C';
			if (cur != prev) {
				sb.append(cur);
				prev = cur;
			}
		}
		return sb.toString();
	}

	boolean isVowel(int i) {
		if ("AEIOUaeiou".indexOf(chs[i]) >= 0)
			return true;
		if ("Yy".indexOf(chs[i]) < 0)
			return false;
		// assert ch == 'Y' | 'y'
		if (i > 0 && !isVowel(i - 1))
			return true;
		return false;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
