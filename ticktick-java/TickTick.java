import static java.util.Arrays.*;

import java.util.*;

public class TickTick {
	double MIN = 5e-8;

	public int count(String[] events) {
		double[] e = new double[events.length + 1];
		for (int i = 1; i < e.length; i++) {
			e[i] = Double.parseDouble(events[i - 1]);
		}
		Set<Long> ts = new TreeSet<Long>();
		for (int i = 0; i < e.length; i++) {
			double close = e[i] - MIN;
			double start = close - Math.ceil(close);
			double prev = 2;
			long set = 0;
			for (int j = 0; j < e.length; j++) {
				double cur = Math.floor(e[j] - start);
				if (cur != prev) {
					set |= (1 << j);
					prev = cur;
				}
			}
			ts.add(set);
		}
		return ts.size();
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
