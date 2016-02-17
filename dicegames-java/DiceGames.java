import java.util.*;

public class DiceGames {
  int[] sides;
  long[][] dp;

  public long countFormations(int[] sides) {
    this.sides = sides;
    dp = new long[sides.length + 1][33];
    Arrays.sort(sides);
    return go(0, 1);
  }

  long go(int n, int min) {
    if (n == sides.length) return 1;
    if (dp[n][min] > 0) return dp[n][min];
    long ret = 0;
    for (int i = min; i <= sides[n]; i++) {
      ret += go(n + 1, i);
    }
    return dp[n][min] = ret;
  }

}
