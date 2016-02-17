public class CirclesCountry {

	public int leastBorders(int[] X, int[] Y, int[] R, int x1, int y1, int x2,
			int y2) {
		int sum = 0;
		int N = X.length;
		for (int i = 0; i < N; i++) {
			boolean in1 = in(X[i], Y[i], R[i], x1, y1);
			boolean in2 = in(X[i], Y[i], R[i], x2, y2);
			if ((in1 & !in2) || (!in1 & in2)) {
				sum++;
			}
		}
		return sum;
	}

	boolean in(int x, int y, int r, int x1, int y1) {
		return (x - x1) * (x - x1) + (y - y1) * (y - y1) <= r * r;
	}

}
