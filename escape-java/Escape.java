import java.util.*;

class State implements Comparable<State> {
  int r, c, life;

  State(int _r, int _c, int _l) {
    r = _r;
    c = _c;
    life = _l;
  }

  @Override
  public int compareTo(State o) {
    return life - o.life;
  }
}

public class Escape {
  int[][] MAZE = new int[501][501]; // 1: harmful, 2: deadly
  int[][] next = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

  public int lowest(String[] harmful, String[] deadly) {
    fill(harmful, 1);
    fill(deadly, 2);

    PriorityQueue<State> pq = new PriorityQueue<State>();
    boolean[][] visited = new boolean[501][501];
    pq.offer(new State(0, 0, 0));
    visited[0][0] = true;
    while (!pq.isEmpty()) {
      State st = pq.poll();
      if (st.r == 500 && st.c == 500) return st.life;
      for (int i = 0; i < next.length; i++) {
        int nr = st.r + next[i][0];
        int nc = st.c + next[i][1];
        if (!isRange(nr, nc)) continue;
        if (visited[nr][nc]) continue;
        pq.offer(new State(nr, nc, st.life + MAZE[nr][nc]));
        visited[nr][nc] = true;
      }
    }
    return -1;
  }

  boolean isRange(int r, int c) {
    return r >= 0 && r <= 500 && c >= 0 && c <= 500 && MAZE[r][c] != 2;
  }

  void fill(String[] strs, int val) {
    for (int i = 0; i < strs.length; i++) {
      String[] sp = strs[i].split(" ");
      int r1 = Math.min(Integer.parseInt(sp[0]), Integer.parseInt(sp[2]));
      int r2 = Math.max(Integer.parseInt(sp[0]), Integer.parseInt(sp[2]));
      int c1 = Math.min(Integer.parseInt(sp[1]), Integer.parseInt(sp[3]));
      int c2 = Math.max(Integer.parseInt(sp[1]), Integer.parseInt(sp[3]));
      for (int r = r1; r <= r2; r++) {
        for (int c = c1; c <= c2; c++) {
          MAZE[r][c] = val;
        }
      }
    }
  }

}
