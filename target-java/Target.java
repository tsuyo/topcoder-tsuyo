import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class Target {

  public String[] draw(int n) {
    if (n == 1) return new String[] { "#" };
    String[] ans = new String[n];
    String[] prev = draw(n - 4);
    for (int i = 0; i < n; i++) {
      char[] line = new char[n];
      Arrays.fill(line, ' ');
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1) line[j] = '#';
        else if (j == 0 || j == n - 1) line[j] = '#';
        else if (i >= 2 && i <= n - 3 && j >= 2 && j <= n - 3) {
          char[] pline = prev[i - 2].toCharArray();
          line[j] = pline[j - 2];
        }
      }
      ans[i] = new String(line);
    }

    return ans;
  }
}
