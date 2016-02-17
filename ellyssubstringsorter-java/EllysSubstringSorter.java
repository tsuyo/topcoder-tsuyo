import static java.util.Arrays.*;

import java.util.*;

public class EllysSubstringSorter {

	public String getMin(String S, int L) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i <= S.length() - L; i++) {
			String s = S.substring(i, i + L);
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String news = S.substring(0, i) + new String(ch)
					+ S.substring(i + L);
			list.add(news);
		}
		Collections.sort(list);
		return list.get(0);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
