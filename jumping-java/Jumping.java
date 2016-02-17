import java.util.*;

public class Jumping {
  public String ableToGet(int x, int y, int[] jumpLengths) {
    int min = jumpLengths[0], max = jumpLengths[0];

    for (int i = 1; i < jumpLengths.length; i++) {
      if (min - jumpLengths[i] >= 0) {
        min -= jumpLengths[i];
      } else {
        // assert min < jumpLength[i]
        if (jumpLengths[i] <= max) {
          min = 0;
        } else {
          min = jumpLengths[i] - max;
        }
      }
      max += jumpLengths[i];
    }
    int dist_sq = x * x + y * y;
    return ((min * min <= dist_sq) && (dist_sq <= ((long) max * max))) ? "Able"
        : "Not able";
  }

  void debug(Object... obj) {
    System.err.println(Arrays.deepToString(obj));
  }
}
