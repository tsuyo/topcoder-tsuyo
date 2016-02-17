import java.util.*;

class State {
  int x, y, k;

  State(int _x, int _y, int _k) {
    x = _x;
    y = _y;
    k = _k;
  }
}

public class TheGridDivTwo {
  int K;
  boolean[][] visited;
  int OFF = 1000;
  int max = -1001;
  int[][] diff = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };

  public int find(int[] x, int[] y, int k) {
    K = k;
    visited = new boolean[2001][2001];
    for (int i = 0; i < x.length; i++)
      visited[x[i] + OFF][y[i] + OFF] = true;
    visited[OFF][OFF] = true;
    bfs(0, 0, 0);
    return max;
  }

  void bfs(int x, int y, int k) {
    Queue<State> que = new LinkedList<State>();
    que.offer(new State(x, y, k));
    while (!que.isEmpty()) {
      State cur = que.poll();
      max = Math.max(max, cur.x);
      if (cur.k == K) {
        continue;
      }
      for (int[] di : diff) {
        int nx = cur.x + di[0];
        int ny = cur.y + di[1];
        if (visited[nx + OFF][ny + OFF]) continue;
        visited[nx + OFF][ny + OFF] = true;
        que.offer(new State(nx, ny, cur.k + 1));
      }
    }
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

}
