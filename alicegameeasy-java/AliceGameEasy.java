import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class AliceGameEasy {

  public long findMinimumValue(long x, long y) {
    long N = find(x + y);
    if (N == -1) return -1;
    debug(N);
    int cnt = 0;
    for (long i = N; i >= 1; i--) {
      if (x >= i) {
        x -= i;
        cnt++;
      }
    }
    return cnt;
  }

  long find(long N) {
    for (long i = 0; i * (i + 1) <= 2 * N; i++) {
      if (2 * N == i * (i + 1)) return i;
    }
    return -1;
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

}
