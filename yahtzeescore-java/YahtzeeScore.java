import static java.util.Arrays.*;

public class YahtzeeScore {

	public int maxPoints(int[] toss) {
		int[] score = new int[7];
		for (int i = 0; i < toss.length; i++) {
			score[toss[i]] += toss[i];
		}
		int max = score[0];
		for (int i = 1; i < score.length; i++) {
			max = Math.max(max, score[i]);
		}
		return max;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
