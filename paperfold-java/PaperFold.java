import static java.util.Arrays.*;

import java.util.*;

public class PaperFold {

	public int numFolds(int[] paper, int[] box) {
		double[] dpaper = new double[] { paper[0], paper[1] };
		double[] dbox = new double[] { box[0], box[1] };
		Arrays.sort(dbox);
		int ans = check(dpaper, dbox, 0);
		return (ans == 100) ? -1 : ans;
	}

	int check(double[] dpa, double[] dbo, int depth) {
		if (depth > 8)
			return 100;
		Arrays.sort(dpa);
		if ((dpa[0] <= dbo[0]) && (dpa[1] <= dbo[1])) {
			return depth;
		}
		int try1 = check(new double[] { dpa[0] / 2, dpa[1] }, dbo, depth + 1);
		int try2 = check(new double[] { dpa[0], dpa[1] / 2 }, dbo, depth + 1);
		return Math.min(try1, try2);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
