import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class Marketing {
  int[][] G = new int[31][31];
  int[] visited = new int[31];
  int K;

	public long howMany(String[] compete) {
    K = compete.length;
    input(compete);

    int res = 0;
    for (int i = 0; i < K; i++) {
      if (visited[i] == 0) {
        if (dfs(i, 1)) res++;
        else return -1;
      }
    }
		return (1 << res);
	}

  void input(String[] complete) {
    for (int i = 0; i < K; i++) {
      if (complete[i].equals("")) continue;
      String[] si = complete[i].split(" ");
      for (String s : si) {
        int j = Integer.parseInt(s);
        G[i][j] = 1;
        G[j][i] = 1;
      }
    }

  }

  boolean dfs(int s, int val) {
    if (visited[s] == val) return true;
    if (visited[s] == -val) return false;
    visited[s] = val;
    for (int i = 0; i < K; i++) {
      if (G[s][i] == 0) continue;
      if (!dfs(i, -val)) return false;
    }
    return true;
  }

}
