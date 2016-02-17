public class SquareScoresDiv2 {

  public int getscore(String s) {
    char[] chs = s.toCharArray();
    int cnt = 0;
    for (int i = 0; i < chs.length; i++) {
      for (int j = i; j < chs.length; j++) {
        if (chs[i] == chs[j]) {
          cnt++;
        } else {
          break;
        }
      }
    }
    return cnt;
  }

}
