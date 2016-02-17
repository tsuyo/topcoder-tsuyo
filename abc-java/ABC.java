public class ABC {

  public String createString(int N, int K) {
    // [n][# of A so far][# of B so far][# of pairs]
    boolean[][][][] dp = new boolean[N + 1][N + 1][N + 1][N * N];
    dp[0][0][0][0] = true;

    for (int n = 1; n <= N; n++) {
      for (int a = 0; a <= n; a++) {
        for (int b = 0; b <= n - a; b++) {
          for (int k = 0; k <= n * (n - 1) / 2; k++) {
            // put a
            if (a - 1 >= 0) {
              dp[n][a][b][k] |= dp[n - 1][a - 1][b][k];
            }
            // put b
            if (b - 1 >= 0 && k - a >= 0) {
              dp[n][a][b][k] |= dp[n - 1][a][b - 1][k - a];
            }
            // put c
            if (k - a - b >= 0) {
              dp[n][a][b][k] |= dp[n - 1][a][b][k - a - b];
            }
          }
        }
      }
    }

    for (int a = 0; a <= N; a++) {
      for (int b = 0; b <= N; b++) {
        if (dp[N][a][b][K]) { // found
          StringBuilder sb = new StringBuilder();
          int cura = a;
          int curb = b;
          int curk = K;
          for (int n = N; n >= 1; n--) {
            if (cura - 1 >= 0 && dp[n - 1][cura - 1][curb][curk]) {
              sb.append('A');
              cura = cura - 1;
            } else if (curb - 1 >= 0 && curk - cura >= 0
                && dp[n - 1][cura][curb - 1][curk - cura]) {
              sb.append('B');
              curb = curb - 1;
              curk = curk - cura;
            } else {
              sb.append('C');
              curk = curk - cura - curb;
            }
          }
          return sb.reverse().toString();
        }
      }
    }
    return "";
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

}
