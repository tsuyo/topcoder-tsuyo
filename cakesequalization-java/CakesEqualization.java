import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class CakesEqualization {

  public double fairDivision(int[] weights, int maxCuts) {
    // assert: the max weights should be cut
    int N = weights.length;
    int[] X = new int[N];
    Arrays.fill(X, 1);
    double ans = Double.MAX_VALUE;
    for (int i = 0; i <= maxCuts; i++) {
      double max = Double.MIN_VALUE;
      double min = Double.MAX_VALUE;
      int maxi = 0;
      for (int j = 0; j < N; j++) {
        if ((double) weights[j] / X[j] > max) {
          maxi = j;
        }
        max = Math.max(max, (double) weights[j] / X[j]);
        min = Math.min(min, (double) weights[j] / X[j]);
      }
      ans = Math.min(ans, max - min);
      X[maxi]++;
    }
    return ans;
  }

}
