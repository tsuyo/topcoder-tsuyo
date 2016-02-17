import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

class State implements Comparable<State> {
  int r, c, dist;

  State(int _r, int _c, int d) {
    r = _r;
    c = _c;
    dist = d;
  }

  @Override
  public int compareTo(State o) {
    return dist - o.dist;
  }

}

public class PathGameDiv2 {
  int R = 2, C;
  int[][] next = { { 0, 1 }, { 1, 0 }, { -1, 0 } };
  char[][] MAZE;

  public int calc(String[] board) {
    C = board[0].length();
    MAZE = new char[R][C];
    int rr = -1;
    int cc = 0;
    int black = 0;
    for (int i = 0; i < board.length; i++) {
      MAZE[i] = board[i].toCharArray();
      if (MAZE[i][0] == '.') {
        rr = i;
      }
      for (int j = 0; j < C; j++) {
        if (MAZE[i][j] == '#') black++;
      }
    }
    int min = Integer.MAX_VALUE;
    if (MAZE[0][0] == '.') min = Math.min(bfs(0, 0), min);
    if (MAZE[1][0] == '.') min = Math.min(bfs(1, 0), min);

    return 2 * C - black - min;
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

  int bfs(int r, int c) {
    debug(r, c);
    boolean[][] visited = new boolean[R][C];
    Queue<State> que = new PriorityQueue<State>();
    que.offer(new State(r, c, 0));
    visited[r][c] = true;
    while (!que.isEmpty()) {
      State st = que.poll();
      if (st.c == C - 1) return st.dist + 1;
      for (int i = 0; i < next.length; i++) {
        int nr = st.r + next[i][0];
        int nc = st.c + next[i][1];

        if (!isRange(nr, nc)) continue;
        if (visited[nr][nc]) continue;
        que.offer(new State(nr, nc, st.dist + 1));
        visited[nr][nc] = true;
      }
    }
    return -1;
  }

  boolean isRange(int r, int c) {
    return r >= 0 && r < R && c >= 0 && c < C && MAZE[r][c] != '#';
  }

}
