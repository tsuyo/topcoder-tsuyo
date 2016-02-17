import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class FoldingPaper2 {

  public int solve(int W, int H, int A) {
    int max = (int) Math.sqrt(A);
    int ans = Integer.MAX_VALUE;
    for (int a = 1; a <= max; a++) {
      if (A % a != 0) continue;
      int b = A / a;
      // assert a < b
      // pat1
      int cnt1 = count(a, W);
      int cnt2 = count(b, H);
      if (cnt1 != -1 && cnt2 != -1) {
        ans = Math.min(ans, cnt1 + cnt2);
      }
      // pat2
      cnt1 = count(a, H);
      cnt2 = count(b, W);
      if (cnt1 != -1 && cnt2 != -1) {
        ans = Math.min(ans, cnt1 + cnt2);
      }
    }
    return (ans == Integer.MAX_VALUE) ? -1 : ans;
  }

  int count(int n, int N) {
    if (n > N) return -1;
    int cnt = 0;
    while (n < N) {
      n *= 2;
      cnt++;
    }
    return cnt;
  }

}
