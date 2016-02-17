import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class TaroFillingAStringDiv2 {

	public int getNumber(String S) {
	  char[] chs = S.toCharArray();
	  int ret = 0;
	  for (int i = 1; i < chs.length; i++) {
	    if (chs[i] == 'A') {
	      if (chs[i-1] == 'A') {
	        ret++;
	      }
	    } else if (chs[i] == 'B') {
	      if (chs[i-1] == 'B') {
	        ret++;
	      }	      
	    } else {
	      if (chs[i-1] == 'A') {
	        chs[i] = 'B';
	      } else if (chs[i-1] == 'B') {
	        chs[i] = 'A';
	      }
	    }      
    }
		return ret;
	}

}
