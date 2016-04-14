import java.util.*;

public class QuizShow {

  // 75 (25%), 125 (25%), 175 (50%) for example 0)
  public int wager(int[] scores, int wager1, int wager2) {
    int[] finals = new int[4];
    finals[0] = Math.max(scores[1] - wager1, scores[2] - wager2);
    finals[1] = Math.max(scores[1] + wager1, scores[2] - wager2);
    finals[2] = Math.max(scores[1] - wager1, scores[2] + wager2);
    finals[3] = Math.max(scores[1] + wager1, scores[2] + wager2);

    int maxp = 0;
    int maxbet = 0;
    for (int i = 0; i <= scores[0]; i++) {
      int prob = 0;
      for (int j = 0; j < 2; j++) { // 0:correct, 1:wrong
        int myscore = (j == 0) ? scores[0] + i : scores[0] - i;
        for (int k = 0; k < finals.length; k++) {
          if (myscore > finals[k]) {
            prob += 1; // actually this is 12.5%
          }
        }
      }
      if (maxp < prob) {
        maxp = prob;
        maxbet = i;
      } else if (maxp == prob) {
        maxbet = Math.min(maxbet, i);
      }
    }
    return maxbet;
  }

}
