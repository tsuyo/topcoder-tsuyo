import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class IncrementingSequence {

  public String canItBeDone(int k, int[] A) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int i = 0; i < A.length; i++) {
      pq.offer(A[i]);
    }

    for (int i = 1; i <= A.length; i++) {
      while (true) {
        int now = pq.poll();
        if (now > i)
          return "IMPOSSIBLE";
        else if (now == i)
          break;
        else
          pq.offer(now + k);
      }
    }
    return "POSSIBLE";
  }

}
