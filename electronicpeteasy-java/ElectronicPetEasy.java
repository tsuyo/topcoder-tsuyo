public class ElectronicPetEasy {

  public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
    for (int i = 0; i < t1; i++) {
      for (int j = 0; j < t2; j++) {
        if (st1 + i * p1 == st2 + j * p2) return "Difficult";
      }
    }
    return "Easy";
  }

}
