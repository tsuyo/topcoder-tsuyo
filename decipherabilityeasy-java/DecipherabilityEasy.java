public class DecipherabilityEasy {

  public String check(String s, String t) {
    for (int i = 0; i < s.length(); i++) {
      String cand = s.substring(0, i) + s.substring(i + 1);
      if (cand.equals(t)) return "Possible";
    }
    return "Impossible";
  }

}
