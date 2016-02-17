import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class AddMultiply {

  public int[] makeExpression(int y) {
    for (int x2 = -1000; x2 <= 1000; x2++) {
      if (x2 == 0 || x2 == 1) continue;
      int t = y - x2;
      for (int x1 = -1000; x1 <= 1000; x1++) {
        if (x1 == 0 || x1 == 1) continue;
        if (t % x1 != 0) continue;
        int x0 = t / x1;
        if (x0 == 0 || x0 == 1) continue;
        if (x0 >= -1000 && x0 <= 1000) {
          // debug(new int[] { x0, x1, x2 });
          return new int[] { x0, x1, x2 };
        }
      }
    }
    return null;
  }

  void debug(Object... obj) {
    System.err.println(Arrays.deepToString(obj));
  }

}
