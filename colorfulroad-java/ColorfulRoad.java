import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ColorfulRoad {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	int[][] dp;
	int n;
	char[] r;

	public int getMin(String road) {
		r = road.toCharArray();
		map.put('R', 0);
		map.put('G', 1);
		map.put('B', 2);
		n = road.length();
		dp = new int[n][3];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		int ans = f(0, 0);
		return (ans == Integer.MAX_VALUE) ? -1 : ans;
	}

	int f(int start, int color) {
		// System.out.println(start + " " + color);
		int nextc = (color + 1) % 3;
		if (start == n - 1) {
			if (map.get(r[start]) == color) {
				// System.out.println("here?");
				return 0;
			} else {
				return Integer.MAX_VALUE;
			}
		}
		if (dp[start][color] != -1)
			return dp[start][color];
		int min = Integer.MAX_VALUE;
		// int nextc = (color + 1) % 3;
		for (int i = start + 1; i < n; i++) {
			if (map.get(r[i]) == nextc) {
				int tmp = f(i, nextc);
				if (tmp == Integer.MAX_VALUE)
					continue;
				min = Math.min(min, tmp + (i - start) * (i - start));
			}
		}
		return (dp[start][color] = min);
	}
}
