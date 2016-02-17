public class CountryGroup {

  public int solve(int[] a) {
    int N = a.length;
    int ans = 0;
    for (int i = 0; i < N; i++) {
      int num = a[i];
      if (i + num > N) return -1;
      int j = i;
      for (; j < i + num; j++) {
        if (a[j] != num) return -1;
      }
      ans++;
      i = j - 1;
    }
    return ans;
  }

}
