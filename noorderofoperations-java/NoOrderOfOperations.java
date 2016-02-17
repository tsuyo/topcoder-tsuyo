import static java.util.Arrays.*;

public class NoOrderOfOperations {

	public int evaluate(String expr) {
		char[] ch = expr.toCharArray();
		int val = val(ch[0]);
		for (int i = 1; i < ch.length - 1; i += 2) {
			char op = ch[i];
			int v = val(ch[i + 1]);
			if (op == '+') {
				val += v;
			} else if (op == '-') {
				val -= v;
			} else if (op == '*') {
				val *= v;
			}
		}
		return val;
	}

	int val(char c) {
		return Integer.parseInt(c + "");
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
