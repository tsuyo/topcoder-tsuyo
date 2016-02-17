import java.util.*;

public class TaroJiroDividing {

  public int getNumber(int A, int B) {
    List<Integer> lista = new ArrayList<Integer>();
    List<Integer> listb = new ArrayList<Integer>();
    lista.add(A);
    listb.add(B);
    while (A % 2 == 0) {
      lista.add(A / 2);
      A = A / 2;
    }
    while (B % 2 == 0) {
      listb.add(B / 2);
      B = B / 2;
    }
    int ret = 0;
    for (int i : lista) {
      for (int j : listb) {
        if (i == j) ret++;
      }
    }
    return ret;
  }

}
