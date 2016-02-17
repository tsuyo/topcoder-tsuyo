import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class AmebaDiv2 {

	public int simulate(int[] X, int A) {
		int cur = A;
		for (int i = 0; i < X.length; i++) {
			if (X[i] == cur)
				cur *= 2;
		}
		return cur;
	}

}
