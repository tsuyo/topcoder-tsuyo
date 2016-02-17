import java.util.Arrays;

public class SparseFactorialDiv2 {

	public long getCount(long lo, long hi, long divisor) {
		return getCount(hi + 1, divisor) - getCount(lo, divisor);
	}

	// count valid n (0 <= n < t)
	// (a + b) % m = (a % m + b) % m
	long getCount(long t, long divisor) {
		long[] bestK = new long[1000]; // the array size is actually # of primes
										// between 2 and 997, so 1000 is enough
		Arrays.fill(bestK, -1);
		long k = 0;
		while (k * k < t - 1) {
			int ind = (int) ((k * k) % divisor);
			if (bestK[ind] == -1) {
				bestK[ind] = k;
			}
			k++;
		}

		long ret = 0;
		for (int a = 0; a < divisor; a++) {
			if (bestK[a] != -1) {
				long lowerBound = bestK[a] * bestK[a] + 1; // n -k^2
				long upperBound = t;
				ret += (countMods(upperBound, divisor, a) - countMods(
						lowerBound, divisor, a));
			}
		}

		return ret;
	}

	// count x such that x % divisor == a in 0 <= x < upperBound
	long countMods(long upperBound, long divisor, long a) {
		if (upperBound % divisor > a) {
			return upperBound / divisor + 1;
		} else {
			return upperBound / divisor;
		}
	}

}
