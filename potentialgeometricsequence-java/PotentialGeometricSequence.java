import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class PotentialGeometricSequence {

  public int numberOfSubsequences(int[] d) {
    int N = d.length;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      cnt++;
      if (i == N - 1) break;
      int diff = d[i + 1] - d[i];
      cnt++;
      for (int j = i + 2; j < N; j++) {
        if (d[j] - d[j-1] == diff) {
          cnt++;
        } else {
          break;
        }
      }
    }

    return cnt;
  }

}
