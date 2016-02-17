import java.util.Map;
import java.util.TreeMap;

public class Poetry {

	public String rhymeScheme(String[] poem) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		int max = 0;
		int[] ans = new int[poem.length];
		for (int i = 0; i < poem.length; i++) {
			String p = poem[i];
			String[] ws = p.split(" ");
			if (p.equals("") || ws.length == 0) {
				ans[i] = -1;
				continue;
			}
			String word = rhyme(ws[ws.length - 1].toLowerCase());
			if (map.containsKey(word)) {
				ans[i] = map.get(word);
			} else {
				ans[i] = max++;
				map.put(word, ans[i]);
			}
		}
		return toStr(ans);
	}

	String rhyme(String word) {
		char[] chs = word.toCharArray();
		int len = chs.length;
		int start = len;
		boolean found = false;
		for (int i = len - 1; i >= 0; i--) {
			if (!found && isVowel(chs, i)) {
				found = true;
				start = i;
			} else if (found && isVowel(chs, i)) {
				start = i;
			} else if (found && !isVowel(chs, i)) {
				break;
			}
		}
		char[] dest = new char[len - start];
		System.arraycopy(chs, start, dest, 0, len - start);
		return new String(dest);
	}

	boolean isVowel(char[] chs, int i) {
		for (char c : "aeiou".toCharArray()) {
			if (c == chs[i])
				return true;
		}
		if (chs[i] != 'y')
			return false;
		if (i != 0 && i != chs.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	String toStr(int[] ans) {
		StringBuilder sb = new StringBuilder();
		for (int i : ans) {
			if (i < 0) {
				sb.append(" ");
			} else if (i < 26) {
				sb.append((char) ('a' + i));
			} else {
				sb.append((char) ('A' + (i - 26)));
			}
		}
		return sb.toString();
	}
}
