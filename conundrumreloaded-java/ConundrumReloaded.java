import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class ConundrumReloaded {
  char[] saying;
  int[][][][] cache;

  public int minimumLiars(String answers) {
    // saying = answers.replaceAll("\\?", "?").toCharArray();
    saying = answers.toCharArray();
    int N = saying.length;
    cache = new int[N + 1][N + 1][2][2];
    for (int i = 0; i < N + 1; i++) {
      for (int j = 0; j < N + 1; j++) {
        Arrays.fill(cache[i][j][0], -1);
        Arrays.fill(cache[i][j][1], -1);
      }
    }
    int res1 = rec(true, 0, true, 0);
    int res2 = rec(false, 0, false, 0);
    int res = Math.min(res1, res2);
    return (res == Integer.MAX_VALUE) ? -1 : res;
  }

  int rec(boolean first, int ind, boolean actual, int lier) {
    int abl = actual ? 1 : 0;
    int fbl = first ? 1 : 0;
    if (cache[ind][lier][abl][fbl] != -1) return cache[ind][lier][abl][fbl];
    if (ind == saying.length)
      return cache[ind][lier][abl][fbl] = ((first == actual) ? lier
          : Integer.MAX_VALUE);
    if (!actual) lier++;
    if (saying[ind] == 'H') {
      return cache[ind][lier][abl][fbl] = rec(first, ind + 1, actual, lier);
    } else if (saying[ind] == 'L') {
      return cache[ind][lier][abl][fbl] = rec(first, ind + 1, !actual, lier);
    } else {
      int res1 = rec(first, ind + 1, actual, lier);
      int res2 = rec(first, ind + 1, !actual, lier);
      return cache[ind][lier][abl][fbl] = Math.min(res1, res2);
    }
  }

  void debug(Object... obj) {
    System.err.println(Arrays.deepToString(obj));
  }

}
