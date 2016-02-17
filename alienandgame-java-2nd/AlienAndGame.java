public class AlienAndGame {
  char[][] chs;
  int[][][] dp;

  public int getNumber(String[] board) {
    int R = board.length;
    int C = board[0].length();
    chs = new char[R][C];
    for (int i = 0; i < R; i++) {
      chs[i] = board[i].toCharArray();
    }
    dp = new int[R][C][C];
    int MIN = Math.min(R, C);
    for (int e = MIN; e >= 1; e--) {
      for (int r = 0; r <= R - e; r++) {
        for (int c = 0; c <= C - e; c++) {
          boolean res = true;
          for (int iter = 0; iter < e; iter++) {
            res &= isSame(r + iter, c, c + e - 1);
          }
          if (res) return e * e;
        }
      }
    }
    return 0; // never reached
  }

  boolean isSame(int r, int c1, int c2) {
    if (dp[r][c1][c2] != 0) return dp[r][c1][c2] == 1;
    if (c1 > c2) return false;
    if (c1 == c2) return true;
    dp[r][c1][c2] = (isSame(r, c1, c2 - 1) && (chs[r][c2 - 1] == chs[r][c2])) ? 1
        : -1;
    return dp[r][c1][c2] == 1;
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

}
