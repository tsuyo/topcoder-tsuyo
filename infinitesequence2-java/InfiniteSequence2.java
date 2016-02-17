import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class InfiniteSequence2 {
  int x, y, p, q;
  int TH = (int) 1e6;
  long[] dp = new long[TH];

  public long calc(long n, int p, int q, int x, int y) {
    this.x = x;
    this.y = y;
    this.p = p;
    this.q = q;

    return A(n);
  }

  long A(long i) {
    if (i <= 0) return 1;
    if (i < TH && dp[(int) i] != 0) return dp[(int) i];
    long val = A(i / p - x) + A(i / q - y);
    if (i < TH) dp[(int) i] = val;
    return val;
  }

}
