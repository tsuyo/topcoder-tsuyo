import static java.util.Arrays.*;

public class BoundingBox {

	public int smallestArea(int[] X, int[] Y) {
		int xmin = Integer.MAX_VALUE, xmax = Integer.MIN_VALUE;
		int ymin = Integer.MAX_VALUE, ymax = Integer.MIN_VALUE;
		for (int i = 0; i < X.length; i++) {
			xmax = Math.max(xmax, X[i]);
			xmin = Math.min(xmin, X[i]);
			ymax = Math.max(ymax, Y[i]);
			ymin = Math.min(ymin, Y[i]);
		}

		return (xmax - xmin) * (ymax - ymin);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
