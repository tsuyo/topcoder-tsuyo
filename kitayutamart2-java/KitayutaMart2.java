import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class KitayutaMart2 {

	public int numBought(int K, int T) {
	  int ans = 0;
	  while (T > 0) {
	    T -= K;
	    K = K*2;
	    ans++;
	  }
		return ans;	  
	}

}
