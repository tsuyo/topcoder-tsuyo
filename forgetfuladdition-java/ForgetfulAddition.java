public class ForgetfulAddition {

  public int minNumber(String expression) {
    char[] chs = expression.toCharArray();
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < chs.length; i++) {
      int a = Integer.parseInt(expression.substring(0, i));
      int b = Integer.parseInt(expression.substring(i));
      min = Math.min(a + b, min);
    }
    return min;
  }

}
