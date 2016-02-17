import java.util.*;

class State implements Comparable<State> {
  int r, c, cost;
  long color;

  State(int _r, int _c, int _cost, long _color) {
    r = _r;
    c = _c;
    cost = _cost;
    color = _color;
  }

  @Override
  public int compareTo(State o) {
    return cost - o.cost;
  }
}

public class ConnectingGameDiv2 {
  int R, C;
  int[][] BRD;
  int[][] next = { { 1, -1 }, { 1, 0 }, { 1, 1 }, { -1, -1 }, { -1, 0 },
      { -1, 1 }, { 0, -1 }, { 0, 1 } };
  // int[] freq = new int[62]; // should be ok
  int[] freq = new int[64];

  public int getmin(String[] board) {
    R = board.length;
    C = board[0].length();
    BRD = new int[R][C];
    for (int r = 0; r < R; r++) {
      char[] chs = board[r].toCharArray();
      for (int c = 0; c < C; c++) {
        int idx = index(chs[c]);
        BRD[r][c] = idx;
        freq[idx]++;
      }
    }
    // debug(R, C, freq);
    return solve();
  }

  int solve() {
    boolean[][] visited = new boolean[R][C];
    Queue<State> pq = new PriorityQueue<State>();
    for (int r = 0; r < R; r++) {
      int cost = freq[BRD[r][0]];
      pq.offer(new State(r, 0, cost, (1L << BRD[r][0])));
    }
    while (!pq.isEmpty()) {
      State cur = pq.poll();
      if (!isRange(cur.r, cur.c) || visited[cur.r][cur.c]) continue;
      if (cur.c == C - 1) return cur.cost;

      visited[cur.r][cur.c] = true;
      for (int[] diff : next) {
        int nr = cur.r + diff[0];
        int nc = cur.c + diff[1];
        if (!isRange(nr, nc)) continue;
        State nstate = null;
        if ((cur.color & (1L << BRD[nr][nc])) == 0) {
          nstate = new State(nr, nc, cur.cost + freq[BRD[nr][nc]], cur.color
              | (1L << BRD[nr][nc]));
        } else {
          nstate = new State(nr, nc, cur.cost, cur.color);
        }
        pq.offer(nstate);
      }
    }
    return -1; // never reached
  }

  // map char to index (0-61)
  int index(char ch) {
    if (ch >= 'A' && ch <= 'Z')
      return ch - 'A'; // 0-25
    else if (ch >= 'a' && ch <= 'z')
      return (ch - 'a') + 26; // 26-51
    else
      return (ch - '0') + 52; // 52-61
  }

  boolean isRange(int r, int c) {
    return r >= 0 && r < R && c >= 0 && c < C;
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }
}
