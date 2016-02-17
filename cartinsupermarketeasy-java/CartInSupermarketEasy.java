public class CartInSupermarketEasy {
  int[][] cache;

  public int calc(int N, int K) {
    cache = new int[N + 1][K + 1];
    for (int i = 0; i < N + 1; i++) {
      for (int j = 0; j < K + 1; j++) {
        cache[i][j] = -1;
      }
    }
    return rec(N, K);
  }

  int rec(int N, int K) {
    if (N == 1) return 1;
    if (cache[N][K] != -1) return cache[N][K];
    // split
    int min = Integer.MAX_VALUE;
    for (int n = 1; n < N; n++) {
      for (int k = 1; k <= K; k++) {
        int cand = Math.max(rec(n, k - 1), rec(N - n, K - k)) + 1;
        min = Math.min(min, cand);
      }
    }
    // no split
    min = Math.min(rec(N - 1, K) + 1, min);
    return cache[N][K] = min;
  }

}
