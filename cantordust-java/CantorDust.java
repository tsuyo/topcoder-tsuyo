import java.util.*;

public class CantorDust {

	public int occurrencesNumber(String[] pattern, int time) {
		String[] line = { "", "" };
		if (!patline(pattern, line))
			return 0;
		String frac = new String(frac(time));
		int rcnt = 0;
		int ccnt = 0;
		for (int i = 0; i < frac.length(); i++) {
			if (frac.startsWith(line[0], i))
				rcnt++;
			if (frac.startsWith(line[1], i)) {
				ccnt++;
			}
		}
		if (line[0].indexOf('X') == -1 && line[1].indexOf('X') == -1) {
			// only white space
			return rcnt * (frac.length() - line[1].length() + 1) + ccnt
					* (frac.length() - line[0].length() + 1) - rcnt * ccnt;
		} else {
			return rcnt * ccnt;
		}
	}

	char[] frac(int time) {
		return frac(new char[] { 'X' }, time);
	}

	char[] frac(char[] org, int time) {
		int E = (int) Math.pow(3, time);
		if (E == org.length)
			return org;
		char[] N = new char[org.length * 3];
		Arrays.fill(N, '.');
		for (int i = 0; i < org.length; i++) {
			if (org[i] == 'X') {
				N[i * 3] = N[i * 3 + 2] = 'X';
			}
		}
		return frac(N, time);
	}

	boolean patline(String[] pattern, String[] line) {
		int R = pattern.length;
		int C = pattern[0].length();
		char[] rline = new char[R];
		Arrays.fill(rline, '.');
		char[] cline = new char[C];
		Arrays.fill(cline, '.');

		// construct lines
		for (int r = 0; r < R; r++) {
			char[] ch = pattern[r].toCharArray();
			for (int c = 0; c < C; c++) {
				if (ch[c] == 'X') {
					rline[r] = 'X';
					cline[c] = 'X';
				}
			}
		}

		// validation
		for (int r = 0; r < R; r++) {
			char[] ch = pattern[r].toCharArray();
			for (int c = 0; c < C; c++) {
				if (rline[r] == 'X' && cline[c] == 'X') {
					if (ch[c] != 'X')
						return false;
				} else {
					if (ch[c] != '.')
						return false;
				}
			}
		}

		line[0] = new String(rline);
		line[1] = new String(cline);
		return true;
	}

	void dump(char[] frac) {
		System.out.println(new String(frac));
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
