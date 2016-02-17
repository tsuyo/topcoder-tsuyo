import static java.util.Arrays.*;

public class Quipu {

	public int readKnots(String knots) {
		int ans = 0;
		char[] ch = knots.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == '-') {
				ans *= 10;
			} else {
				ans++;
			}
		}
		return ans;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
