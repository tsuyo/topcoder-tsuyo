import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.io.*;
import java.util.*;

public class PipeCuts {

  public double probability(int[] weldLocations, int L) {
    Arrays.sort(weldLocations);
    int count = 0;
    for (int i = 0; i < weldLocations.length; i++) {
      for (int j = i + 1; j < weldLocations.length; j++) {
        if (weldLocations[i] > L || weldLocations[j] - weldLocations[i] > L
            || 100 - weldLocations[j] > L) {
          count++;
        }
      }
    }
    return (double) count
        / (weldLocations.length * (weldLocations.length - 1) / 2);
  }

}
