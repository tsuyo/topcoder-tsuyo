public class MonstersAndBunnies {

	public double survivalProbability(int M, int B) {
		if ((M & 1) == 1) {
			return 0.0;
		}
		return p(M);
	}

	// mC2 / (m+1)C2 = (m-1)/(m+1)
	double p(int M) {
		if (M == 0) {
			return 1.0;
		}
		double m = M;
		return ((m - 1) / (m + 1)) * p(M - 2);
	}
}
