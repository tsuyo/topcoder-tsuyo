import java.util.*;

class State {
  int ra, rb, ca, cb;
  int dist;

  State(int ra, int ca, int rb, int cb, int d) {
    this.ra = ra;
    this.rb = rb;
    this.ca = ca;
    this.cb = cb;
    this.dist = d;
  }

  public boolean isSwap(State o) {
    return ra == o.rb && ca == o.cb && rb == o.ra && cb == o.ca;
  }

  public boolean isSame(State o) {
    return ra == rb && ca == cb;
  }
}

public class PathFinding {
  int R, C;
  int[][] next = { { 0, 0 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 },
      { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
  char[][] BRD;

  public int minTurns(String[] board) {
    R = board.length;
    C = board[0].length();
    BRD = new char[R][C];
    int ra = 0, rb = 0, ca = 0, cb = 0;
    for (int r = 0; r < R; r++) {
      BRD[r] = board[r].toCharArray();
      for (int c = 0; c < C; c++) {
        if (BRD[r][c] == 'A') {
          ra = r;
          ca = c;
        } else if (BRD[r][c] == 'B') {
          rb = r;
          cb = c;
        }
      }
    }
    return bfs(ra, ca, rb, cb);
  }

  int bfs(int ra, int ca, int rb, int cb) {
    boolean[][][][] visited = new boolean[R][C][R][C];
    Queue<State> que = new LinkedList<State>();
    que.offer(new State(ra, ca, rb, cb, 0));
    visited[ra][ca][rb][cb] = true;
    while (!que.isEmpty()) {
      State st = que.poll();
      if (st.ra == rb && st.rb == ra && st.ca == cb && st.cb == ca) {
        return st.dist;
      }
      for (int A = 0; A < next.length; A++) {
        int nra = st.ra + next[A][0];
        int nca = st.ca + next[A][1];
        if (!isRange(nra, nca)) continue;
        for (int B = 0; B < next.length; B++) {
          int nrb = st.rb + next[B][0];
          int ncb = st.cb + next[B][1];
          if (!isRange(nrb, ncb)) continue;
          if (visited[nra][nca][nrb][ncb]) continue;
          State nst = new State(nra, nca, nrb, ncb, st.dist + 1);
          if (st.isSame(nst) || st.isSwap(nst)) continue;
          que.offer(nst);
          visited[nra][nca][nrb][ncb] = true;
        }
      }
    }
    return -1;
  }

  boolean isRange(int r, int c) {
    return r >= 0 && r < R && c >= 0 && c < C && BRD[r][c] != 'X';
  }

}
