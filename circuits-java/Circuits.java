import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class Circuits {
  int N;
  // int[][] G;
  int[][] C;

  public int howLong(String[] connects, String[] costs) {
    N = connects.length;
    // input
    C = new int[N][N];
    for (int i = 0; i < N; i++) {
      Arrays.fill(C[i], Integer.MAX_VALUE);
    }
    for (int i = 0; i < N; i++) {
      if (connects[i].equals("")) continue;
      String[] sconnects = connects[i].split(" ");
      String[] scosts = costs[i].split(" ");
      for (int j = 0; j < sconnects.length; j++) {
        int to = Integer.parseInt(sconnects[j]);
        C[i][to] = -Integer.parseInt(scosts[j]);
      }
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      max = Math.max(max, longest(i));
    }
    return max;
  }

  int longest(int S) {
    int[] dist = new int[N];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[S] = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N; k++) {
          if (C[k][j] != Integer.MAX_VALUE) {
            dist[j] = Math.min(dist[j], dist[k] + C[k][j]);
          }
        }
      }
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < dist.length; i++) {
      min = Math.min(min, dist[i]);
    }
    return -min;
  }

}
