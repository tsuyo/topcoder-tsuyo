import static java.util.Arrays.*;

import java.util.*;

public class EllysNumberGuessing {

	public int getNumber(int[] guesses, int[] answers) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = guesses.length;
		for (int i = 0; i < N; i++) {
			add(map, guesses[i] + answers[i]);
			add(map, guesses[i] - answers[i]);
		}
		int cand = -1;
		for (int i : map.keySet()) {
			if (map.get(i) == N) {
				if (cand != -1)
					return -1;
				cand = i;
			}
		}
		return (cand == -1) ? -2 : cand;
	}

	void add(Map<Integer, Integer> map, int val) {
		if (val >= 1 && val <= 1000000000) {
			if (!map.containsKey(val)) {
				map.put(val, 1);
			} else {
				map.put(val, map.get(val) + 1);
			}
		}
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
