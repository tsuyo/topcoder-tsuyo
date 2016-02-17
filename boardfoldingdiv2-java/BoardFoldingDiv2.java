import java.util.*;

public class BoardFoldingDiv2 {
  int M, N;
  char[][] chs;
  boolean[][][][] visited;
  long[] NL, ML;

  public int howMany(String[] paper) {
    N = paper.length;
    M = paper[0].length();
    chs = new char[N][M];
    for (int n = 0; n < N; n++) {
      char[] tmp = paper[n].toCharArray();
      for (int m = 0; m < M; m++) {
        chs[n][m] = tmp[m];
      }
    }
    visited = new boolean[N][N][M][M];
    NL = new long[N];
    ML = new long[M];
    // fill NL
    for (int n = 0; n < N; n++) {
      long val = 0;
      for (int m = 0; m < M; m++) {
        val = (val << 1) + (chs[n][m] == '1' ? 1 : 0);
      }
      NL[n] = val;
    }
    // fill ML
    for (int m = 0; m < M; m++) {
      long val = 0;
      for (int n = 0; n < N; n++) {
        val = (val << 1) + (chs[n][m] == '1' ? 1 : 0);
      }
      ML[m] = val;
    }
    return rec(0, N - 1, 0, M - 1);
  }

  int rec(int n0, int n1, int m0, int m1) {
    // debug(n0, n1, m0, m1);
    if (visited[n0][n1][m0][m1]) return 0;
    visited[n0][n1][m0][m1] = true;
    if (n0 == n1 && m0 == m1) return 1;

    int ans = 1;
    // split by horizontal line
    for (int n = n0; n < n1; n++) {
      int h0 = n - n0 + 1;
      int h1 = n1 - n;
      int dist = Math.min(h0, h1);
      if (!check(true, n, dist, m0, m1)) continue;
      if (h0 == h1) {
        ans += rec(n0, n, m0, m1);
        ans += rec(n + 1, n1, m0, m1);
      } else if (h0 < h1) {
        ans += rec(n + 1, n1, m0, m1);
      } else {
        ans += rec(n0, n, m0, m1);
      }
    }
    for (int m = m0; m < m1; m++) {
      int h0 = m - m0 + 1;
      int h1 = m1 - m;
      int dist = Math.min(h0, h1);
      if (!check(false, m, dist, n0, n1)) continue;
      if (h0 == h1) {
        ans += rec(n0, n1, m0, m);
        ans += rec(n0, n1, m + 1, m1);
      } else if (h0 < h1) {
        ans += rec(n0, n1, m + 1, m1);
      } else {
        ans += rec(n0, n1, m0, m);
      }
    }
    return ans;
  }

  boolean check(boolean hori, int center, int dist, int r0, int r1) {
    for (int d = 0; d < dist; d++) {
      if (hori) {
        long mask = ((1L << (r1 - r0 + 1)) - 1) << (M - 1 - r1);
        if ((NL[center - d] & mask) != (NL[center + 1 + d] & mask)) {
          return false;
        }
      } else {
        long mask = ((1L << (r1 - r0 + 1)) - 1) << (N - 1 - r1);
        if ((ML[center - d] & mask) != (ML[center + 1 + d] & mask)) {
          return false;
        }
      }
    }
    return true;
  }

  // boolean check(boolean hori, int center, int dist, int r0, int r1) {
  // for (int d = 0; d < dist; d++) {
  // for (int r = r0; r <= r1; r++) {
  // if (hori) {
  // if (chs[center - d][r] != chs[center + 1 + d][r]) {
  // return false;
  // }
  // } else {
  // if (chs[r][center - d] != chs[r][center + 1 + d]) {
  // return false;
  // }
  // }
  // }
  // }
  // return true;
  // }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }
}
