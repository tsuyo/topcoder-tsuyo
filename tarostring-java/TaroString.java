import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class TaroString {

	public String getAnswer(String S) {
		int ci = -1;
		int ai = -1;
		int ti = -1;
		char[] chs = S.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if ((chs[i] == 'C' && ci != -1) || (chs[i] == 'A' && ai != -1)
					|| (chs[i] == 'T' && ti != -1)) {
				return "Impossible";
			}
			if (chs[i] == 'C') {
				ci = i;
			}
			if (chs[i] == 'A') {
				ai = i;
			}
			if (chs[i] == 'T') {
				ti = i;
			}
		}
		if (ci == -1 || ai == -1 || ti == -1)
			return "Impossible";
		if (ci < ai && ai < ti)
			return "Possible";
		else
			return "Impossible";
	}
	
}
