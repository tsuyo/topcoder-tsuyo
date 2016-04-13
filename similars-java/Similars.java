public class Similars {

  public int maxsim(int L, int R) {
    int[] bmap = new int[1 << 10];
    for (int i = L; i <= R; i++) {
      put(bmap, i);
    }
    int max = 0;
    for (int i = 0; i < bmap.length; i++) {
      if (bmap[i] > 1) {
        max = Math.max(max, Integer.bitCount(i));
      }
    }
    return max;
  }

  void put(int[] bmap, int n) {
    // convert n: 1123 -> (bitmap) 1110
    int map = 0;
    while (n > 0) {
      map |= 1 << (n % 10);
      n /= 10;
    }
    for (int set = map; set != 0; set = (set - 1) & map) {
      bmap[set]++;
    }
  }

}
