import java.util.*;

public class Egalitarianism3Easy {

  int N;
  int[][] E = new int[11][11];
  int[][] res;

  public int maxCities(int n, int[] a, int[] b, int[] len) {
    N = n;

    for (int i = 0; i < a.length; i++) {
      E[a[i]][b[i]] = len[i];
      E[b[i]][a[i]] = len[i];
    }

    res = new int[N + 1][N + 1];
    for (int i = 0; i < res.length; i++) {
      Arrays.fill(res[i], -1);
    }
    for (int i = 1; i <= N; i++) {
      res[i][i] = 0;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = i + 1; j <= n; j++) {
        rec(i, j, 0, i);
      }
    }
    return check();
  }

  void rec(int s, int t, int p, int cur) {
    res[s][cur] = res[s][p] + E[p][cur];
    if (cur == t) return;
    for (int i = 1; i <= N; i++) {
      if (E[cur][i] == 0 || i == p) continue;
      rec(s, t, cur, i);
    }
  }

  int check() {
    int max = -1;
    int upto = 1 << (N + 1);
    HERE: for (int U = 1; U < upto; U++) {
      int val = -1;
      for (int i = 1; i <= N; i++) {
        if (((U >> i) & 1) == 0) continue;
        for (int j = i + 1; j <= N; j++) {
          if (((U >> j) & 1) == 0) continue;
          if (val == -1) {
            val = res[i][j];
          } else {
            if (val != res[i][j]) continue HERE;
          }
        }
      }
      max = Math.max(max, Integer.bitCount(U >> 1));
    }
    return max;
  }

}
