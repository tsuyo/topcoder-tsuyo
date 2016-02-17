import java.util.*;

public class GoodSubset {
  int N;
  Integer[] D;
  int MOD = 1000000007;
  Map[] dp;

  public int numberOfSubsets(int goodValue, int[] d) {
    N = d.length;
    D = new Integer[N];
    for (int i = 0; i < d.length; i++) {
      D[i] = d[i];
    }
    dp = new HashMap[N + 1];
    for (int i = 0; i <= N; i++) {
      dp[i] = new HashMap();
    }

    Arrays.sort(D, Collections.reverseOrder());
    int num1 = num1();
    int multi = multi(num1);
    long val = (long) rec(goodValue, 0, N - num1, false);

    debug(val, num1);
    if (val == 0) {
      if (num1 == 0 || goodValue != 1)
        return 0;
      else
        return (multi - 1);
    } else {
      if (num1 == 0)
        return (int) val;
      else
        return (int) ((val * multi) % MOD);
    }
  }

  int multi(int n) {
    if (n == 0) return 1;
    long ret = 1;
    for (int i = 0; i < n; i++) {
      ret = ret * 2 % MOD;
    }
    return (int) ret;
  }

  int num1() {
    int ret = 0;
    for (int i = 0; i < D.length; i++) {
      if (D[i] == 1) ret++;
    }
    return ret;
  }

  int rec(int val, int i, int upto, boolean use) {
    if (dp[i].containsKey(val)) return (int) dp[i].get(val);
    if (i == upto) {
      if (val == 1 && use == true) return 1;
      return 0;
    }
    long ret = 0;
    if (val % D[i] == 0) ret = rec(val / D[i], i + 1, upto, true);
    ret += rec(val, i + 1, upto, use);
    dp[i].put(val, (int) (ret % MOD));
    return (int) (ret % MOD);
  }

  void debug(Object... obj) {
    System.err.println(Arrays.deepToString(obj));
  }

}
