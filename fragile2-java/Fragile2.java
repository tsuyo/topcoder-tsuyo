public class Fragile2 {
  int N;
  char[][] G;

  public int countPairs(String[] graph) {
    N = graph.length;
    G = new char[N][N];
    for (int i = 0; i < N; i++) {
      G[i] = graph[i].toCharArray();
    }
    // check how many connected
    int org = howmany(-1, -1);
    int ANS = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        // prepare
        for (int iii = 0; iii < N; iii++) {
          G[i][iii] = 'N';
          G[iii][i] = 'N';
          G[j][iii] = 'N';
          G[iii][j] = 'N';
        }
        int now = howmany(i, j);
        if (now > org) {
          ANS++;
        }
        restore(graph);
      }
    }
    return ANS;
  }

  void restore(String[] graph) {
    for (int i = 0; i < N; i++) {
      G[i] = graph[i].toCharArray();
    }
  }

  int howmany(int ig1, int ig2) {
    boolean[] vis = new boolean[N];
    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (i == ig1 || i == ig2) continue;
      if (!vis[i]) {
        ans++;
        dfs(i, vis);
      }
    }
    return ans;
  }

  void dfs(int S, boolean[] visited) {
    visited[S] = true;
    for (int i = 0; i < N; i++) {
      if (G[S][i] == 'Y' && !visited[i]) {
        dfs(i, visited);
      }
    }
  }

}
