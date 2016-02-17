import java.util.*;

public class BinaryFlips {
	int S, K;

	public int minimalMoves(int A, int B, int K) {
		if (A == 0)
			return 0;
		if (A + B < K)
			return -1;
		this.K = K;
		S = A + B;

		int min = A, max = A;
		for (int i = 0; i <= S; i++) {
			// debug(min, max);
			// if (min == 0)
			if (check(min, max))
				return i + 1;
			// calc min of min
			int mincand = getMin(min);
			int maxcand = getMax(min);

			mincand = Math.min(mincand, getMin(max));
			maxcand = Math.max(maxcand, getMax(max));
			min = mincand;
			max = maxcand;
		}
		return -1;
	}

	boolean check(int min, int max) {
		return (min <= K) && (max >= K) && (min % 2 == K % 2);
	}

	int getMin(int x) {
		if (x >= K) {
			return x - K;
		} else {
			return K - x;
		}
	}

	int getMax(int x) {
		if (x + K <= S) {
			return x + K;
		} else {
			return S - (K - (S - x));
		}
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
