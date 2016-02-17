import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;

public class BridgeCrossing {

	public int minTime(int[] times) {
		sort(times);
		int rest = times.length;
		int cost = 0;

		while (rest >= 4) {
			cost += minLatest2(times, rest);
			rest -= 2;
		}
		// assert rest <= 3
		if (rest == 1) {
			cost += times[0];
		} else if (rest == 2) {
			cost += times[1];
		} else {
			cost += (times[2] + times[0] + times[1]);
		}
		return cost;
	}

	// see editorial for this implementation
	// this is only applied if N >= 4
	int minLatest2(int[] times, int rest) {
		// pattern 1: <- AB, A ->, YZ <-, B ->
		int cand1 = times[1] + times[0] + times[rest - 1] + times[1];
		// pattern 2: <- AZ, A ->, AY <-, A ->
		int cand2 = times[rest - 1] + times[0] + times[rest - 2] + times[0];
		return min(cand1, cand2);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
