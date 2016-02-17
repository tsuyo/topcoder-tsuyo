import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class LightSwitchingPuzzle {

  public int minFlips(String state) {
    char[] chs = state.toCharArray();
    int N = chs.length;
    boolean[] L = new boolean[N + 1];
    for (int i = 1; i < L.length; i++) {
      L[i] = (chs[i - 1] == 'Y') ? true : false;
    }
    int cnt = 0;
    for (int i = 1; i < L.length; i++) {
      if (!L[i]) continue;
      cnt++;
      for (int j = i; j < L.length; j += i) {
        L[j] = !L[j];
      }
    }
    return cnt;
  }

}
