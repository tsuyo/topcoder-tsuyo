import java.util.*;

public class LCMSetEasy {

	public String include(int[] S, int x) {
		int N = S.length;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			if (x % S[i] == 0)
				list.add(S[i]);
		}
		Integer[] ary = (Integer[]) list.toArray(new Integer[0]);
		// x is "common multiplier" for S, but may not be a
		// "least common multiplier (lcm)" (just a "candidate" for it)
		long lcm = 1;
		for (int i : ary) {
			lcm = lcm(lcm, i);
		}
		return (lcm == x) ? "Possible" : "Impossible";
	}

	long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
