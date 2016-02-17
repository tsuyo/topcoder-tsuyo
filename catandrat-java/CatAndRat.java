import static java.util.Arrays.*;
import static java.lang.Math.*;

import java.util.*;

public class CatAndRat {

  public double getTime(int R, int T, int Vrat, int Vcat) {
    if (Vrat >= Vcat) return -1.0;
    double D = Math.PI * R;
    double rat = Vrat * T;
    if (rat >= D) {
      return D / (Vcat - Vrat);
    } else {
      return rat / (Vcat - Vrat);
    }
  }

}
