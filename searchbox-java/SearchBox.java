import java.util.*;

public class SearchBox {

	public int find(String text, String search, String wholeWord, int start) {
		return wholeWord.equals("Y") ? yes(text, search, start) : no(text,
				search, start);
	}

	int yes(String text, String search, int start) {
		char[] chs = text.toCharArray();
		// skip the first word if it starts from the middle of search word
		int i = start;
		if (start > 0 && chs[start - 1] != ' ') {
			for (; i < chs.length; i++) {
				if (chs[i] == ' ') {
					i++;
					break;
				}
			}
		}
		if (i == chs.length)
			return -1;
		String news = text.substring(i);
		String[] ss = news.split("\\s+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : ss) {
			if (!map.containsKey(s)) {
				map.put(s, text.indexOf(search, i));
			}
			i += (s.length() + 1);
		}
		if (!map.containsKey(search))
			return -1;
		return map.get(search);
	}

	int no(String text, String search, int start) {
		return text.indexOf(search, start);
	}

}
