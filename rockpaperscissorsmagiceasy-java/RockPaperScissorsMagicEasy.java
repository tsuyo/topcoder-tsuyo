import java.util.*;

public class RockPaperScissorsMagicEasy {
  int[][] cache;

  public int count(int[] card, int score) {
    if (card.length < score) return 0;
    int N = card.length;
    int lose = N - score;
    cache = new int[N + 1][N + 1];
    for (int n = 0; n <= N; n++) {
      Arrays.fill(cache[n], -1);
    }
    return (int) ((long) comb(N, score) * kai2(lose) % 1000000007);
  }

  int comb(int n, int k) {
    if (k == 0 || k == n) return 1;
    if (cache[n][k] != -1) return cache[n][k];
    return cache[n][k] = (comb(n - 1, k - 1) + comb(n - 1, k)) % 1000000007;
  }

  int kai2(int n) {
    int a = 1;
    while (n-- > 0) {
      a = (a * 2) % 1000000007;
    }
    return a;
  }

}
