import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class GreaterGameDiv2 {

	public int calc(int[] snuke, int[] sothe) {
	  int cnt = 0;
	  for (int i = 0; i < snuke.length; i++) {
      if (snuke[i] > sothe[i]) cnt++;
    }
		return cnt;
	}

}
