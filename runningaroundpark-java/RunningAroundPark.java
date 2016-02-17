import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class RunningAroundPark {

  public int numberOfLap(int N, int[] d) {
    int prev = d[0];
    int ans = 1;
    for (int i = 1; i < d.length; i++) {
      if (d[i] <= prev) {
        ans++;        
      }
      prev = d[i];
    }
    return ans;
  }

}
