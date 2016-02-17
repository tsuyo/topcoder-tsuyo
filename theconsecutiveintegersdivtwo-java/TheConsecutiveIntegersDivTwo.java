import java.util.*;

public class TheConsecutiveIntegersDivTwo {

  public int find(int[] numbers, int k) {
    if (k == 1) return 0;
    Arrays.sort(numbers);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length - 1; i++) {
      int cand = Math.abs(numbers[i + 1] - numbers[i] - 1);
      min = Math.min(min, cand);
    }
    return min;
  }

}
