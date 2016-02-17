import static java.util.Arrays.*;

public class RecurrenceRelation {

	public int moduloTen(int[] coefficients, int[] initial, int N) {
		int[] x = new int[N + 1];
		System.arraycopy(initial, 0, x, 0, Math.min(initial.length, x.length));
		int K = coefficients.length;
		for (int i = K; i <= N; i++) {
			for (int j = 0; j < K; j++) {
				x[i] += mod(coefficients[j] * x[i - K + j]);
			}
			x[i] = mod(x[i]);
		}
		return mod(x[N]);
	}

	int mod(int a) {
		int cand = a % 10;
		return (cand >= 0) ? cand : cand + 10;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
