import java.util.*;

public class SortishDiv2 {
  int swap, N;
  int[] seq;
  int[] rest;
  int ans = 0;

  public int ways(int sortedness, int[] seq) {
    this.seq = seq;
    N = seq.length;
    this.swap = N * (N - 1) / 2 - sortedness;
    int zero = 0;
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < seq.length; i++) {
      if (seq[i] == 0) {
        zero++;
        continue;
      }
      set.add(seq[i]);
    }
    rest = new int[zero];
    int idx = 0;
    for (int i = 1; i <= N; i++) {
      if (set.contains(i)) continue;
      rest[idx++] = i;
    }
    allperm(new int[zero], new boolean[zero], 0);
    return ans;
  }

  void allperm(int[] perm, boolean[] used, int cur) {
    if (cur == perm.length) {
      exec(perm);
    }
    for (int i = 0; i < perm.length; i++) {
      if (used[i] == true) continue;
      used[i] = true;
      perm[cur] = i;
      allperm(perm, used, cur + 1);
      used[i] = false;
    }
  }

  void exec(int[] perm) {
    int[] array = new int[N];
    int idx = 0;
    for (int i = 0; i < N; i++) {
      if (seq[i] != 0) {
        array[i] = seq[i];
      } else {
        array[i] = rest[perm[idx++]];
      }
    }

    int swp = 0;
    for (int i = N - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swp++;
          swap(array, j, j + 1);
        }
      }
    }
    // debug(array, swp);
    if (swap == swp) ans++;
  }

  void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

}
