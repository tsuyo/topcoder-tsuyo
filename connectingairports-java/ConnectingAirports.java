import java.util.*;

class Num implements Comparable<Num> {
  int i, v;

  Num(int i, int v) {
    this.i = i;
    this.v = v;
  }

  @Override
  public int compareTo(Num o) {
    if (v - o.v != 0) return v - o.v;
    return i - o.i;
  }

  @Override
  public String toString() {
    return "[i=" + i + ",v=" + v + "]";
  }
}

public class ConnectingAirports {

  public String[] getSchedule(int[] capacityA, int[] capacityU) {
    char[][] ans = new char[capacityA.length][capacityU.length];
    for (int i = 0; i < ans.length; i++) {
      Arrays.fill(ans[i], '0');
    }
    if (!check(capacityA, capacityU)) return new String[0];

    int iterA = sum(capacityA);
    int iterU = sum(capacityU);
    if (iterA != iterU) return new String[0];

    int done = 0;
    HERE: for (int a = 0; a < capacityA.length; a++) {
      // HERE: for (int a = 0; a < 1; a++) {
      for (int u = capacityU.length - 1; u >= 0; u--) {
        // for (int u = capacityU.length - 1; u >= capacityU.length - 1; u--) {
        if (capacityA[a] == 0) continue HERE;
        if (capacityU[u] == 0) continue;
        // int[] CA = Arrays.copyOf(capacityA, capacityA.length);
        // int[] CU = Arrays.copyOf(capacityU, capacityU.length);
        Num[] CA = copy(capacityA);
        Num[] CU = copy(capacityU);
        CA[a].v--;
        CU[u].v--;
        if (cando(CA, CU, iterA - done - 1, a, u)) {
          capacityA[a]--;
          capacityU[u]--;
          ans[a][u] = '1';
          done++;
          if (done == iterA) break HERE;
        }
      }
    }
    // debug(done, ans);
    if (done != iterA) return new String[0];

    String[] ret = new String[ans.length];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = new String(ans[i]);
    }
    return ret;
  }

  boolean cando(Num[] CA, Num[] CU, int rest, int aa, int uu) {
    Arrays.sort(CA);
    // Arrays.sort(CU);
    int done = 0;
    for (int a = CA.length - 1; a >= 0; a--) {
      Arrays.sort(CU);
      for (int u = CU.length - 1; u >= 0; u--) {
        if (CA[a].i == aa && CU[u].i == uu) continue;
        if (CA[a].v > 0 && CU[u].v > 0) {
          done++;
          CA[a].v--;
          CU[u].v--;
        }
      }
    }
    // debug(CA);
    // debug(CU);
    // debug(done, rest);
    return done == rest;
  }

  Num[] copy(int[] ia) {
    Num[] ret = new Num[ia.length];
    for (int i = 0; i < ia.length; i++) {
      ret[i] = new Num(i, ia[i]);
    }
    return ret;
  }

  boolean check(int[] A, int[] U) {
    for (int i = 0; i < A.length; i++) {
      if (A[i] > U.length) return false;
    }
    for (int i = 0; i < U.length; i++) {
      if (U[i] > A.length) return false;
    }
    return true;
  }

  int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  void debug(Object... obj) {
    System.err.println(Arrays.deepToString(obj));
  }

}
