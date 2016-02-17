import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class DoubleLetter {

  public String ableToSolve(String S) {
    String s1 = S;
    while (s1.length() != 0) {
      String s2 = s1.replaceFirst("([a-z])\\1", "");
      if (s1.equals(s2)) return "Impossible";
      s1 = s2;
    }
    return "Possible";
  }

}
