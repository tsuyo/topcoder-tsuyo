import static java.util.Arrays.*;

public class FlowerGarden {
	int N;

	public int[] getOrdering(int[] height, int[] bloom, int[] wilt) {
		N = height.length;
		boolean[] used = new boolean[1001];
		int[] order = new int[N];

		// decide order[i] from 0 (the closest)
		for (int i = 0; i < N; i++) {
			order[i] = 0;
			for (int j = 0; j < N; j++) {
				if (!used[height[j]] && !conflict(j, used, height, bloom, wilt))
					order[i] = Math.max(order[i], height[j]);
			}
			used[order[i]] = true;
		}
		return order;
	}

	boolean conflict(int curi, boolean[] used, int[] height, int[] bloom,
			int[] wilt) {
		for (int i = 0; i < N; i++) {
			if (i == curi || used[height[i]] || height[curi] < height[i])
				continue;
			// if (!(bloom[curi] > wilt[i] || wilt[curi] < bloom[i]))
			if (bloom[curi] <= wilt[i] && wilt[curi] >= bloom[i])
				return true;
		}
		return false;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
