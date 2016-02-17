import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class FloorBoards {
  char[][] chs;
  int H, W;

  // 0:-, 1:|
  public int layout(String[] room) {
    H = room.length;
    W = room[0].length();
    chs = new char[H + 2][W + 2];
    for (int h = 0; h < H + 2; h++) {
      for (int w = 0; w < W + 2; w++) {
        if (h == 0 || h == H + 1 || w == 0 || w == W + 1) {
          chs[h][w] = '#';
        } else {
          char[] tmp = room[h - 1].toCharArray();
          System.arraycopy(tmp, 0, chs[h], 1, W);
        }
      }
    }

    // main logic
    int[][] dp = new int[H + 1][1 << W];
    for (int h = 1; h <= H; h++) {
      for (int i = 0; i < (1 << W); i++) {
        dp[h][i] = Integer.MAX_VALUE;
        for (int j = 0; j < (1 << W); j++) {
          dp[h][i] = Math.min(dp[h][i], dp[h - 1][j] + req(h, j, i));
        }
      }
    }
    // for (int i = 0; i <= H; i++)
    // debug(dp[i]);

    // found min
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < (1 << W); i++) {
      min = Math.min(min, dp[H][i]);
    }
    return min;
  }

  int req(int h, int prev, int cur) {
    int ret = 0;
    for (int w = 0; w < W; w++) {
      if (chs[h][w + 1] == '#') continue;
      if (((cur >> (W - 1 - w)) & 1) == 0) {
        if (chs[h][w] == '#' || ((cur >> (W - w)) & 1) == 1) ret++;
      } else {
        if (chs[h - 1][w + 1] == '#' || ((prev >> (W - 1 - w)) & 1) == 0)
          ret++;
      }
    }
    return ret;
  }

  void debug(Object... obj) {
    System.err.println(Arrays.deepToString(obj));
  }

}
