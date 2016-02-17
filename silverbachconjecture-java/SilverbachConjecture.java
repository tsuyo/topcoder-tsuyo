public class SilverbachConjecture {

	public int[] solve(int n) {
		for (int i = 4; i < n; i++) {
			if (!isPrime(i) && !isPrime(n - i)) {
				return new int[] { i, n - i };
			}
		}
		return null;
	}

	boolean isPrime(int n) {
		// assert n >= 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return n != 1;
	}

}
