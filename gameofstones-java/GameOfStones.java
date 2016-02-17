import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class GameOfStones {

	public int count(int[] stones) {
	  int sum = 0;
	  int N = stones.length;
	  for (int i = 0; i < stones.length; i++) {
      sum += stones[i];
    }
	  if ((sum % N) != 0) return -1;
	  int avg = sum / N;
	  int cnt = 0;
	  for (int i = 0; i < stones.length; i++) {
	    int abs = Math.abs(stones[i] - avg);
	    if ((abs % 2) != 0) return -1;
	    cnt += abs;
	  }
		return cnt / 4;
	}

}
