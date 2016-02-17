import java.util.*;

class Node implements Comparable<Node> {
  int rest, score;

  Node(int r, int s) {
    rest = r;
    score = s;
  }

  @Override
  public int compareTo(Node o) {
    if (score != o.score) return score - o.score;
    return -(rest - o.rest);
  }

  @Override
  public String toString() {
    return score + " " + rest;
  }

}

public class TheFootballDivTwo {

  public int find(int yourScore, int[] scores, int[] numberOfTeams) {
    int myScore = yourScore + 6;
    int N = scores.length;
    PriorityQueue<Node> pq = new PriorityQueue<Node>();
    int eneNum = enemyNumber(numberOfTeams);
    int upNum = uppers(scores, numberOfTeams, myScore);
    int loNum = eneNum - upNum;
    int rest = (loNum - upNum - 1) * 2;
    if (rest <= 0) return upNum + 1;

    for (int i = 0; i < N; i++) {
      if (scores[i] <= myScore) {
        for (int j = 0; j < numberOfTeams[i]; j++) {
          pq.offer(new Node(2, scores[i]));
        }
      }
    }

    int add = 0;
    while (rest > 0) {
      Node n1 = pq.poll();
      if (n1.rest == 2) {
        if (n1.score + 3 > myScore) {
          add++;
          rest -= 2;
        } else {
          pq.offer(new Node(n1.rest - 1, n1.score + 3));
        }
      } else {
        if (n1.score + 3 > myScore) {
          add++;
        }
      }
      rest -= 2;
    }
    // for (Node n : pq) {
    // if (n.score > myScore) add++;
    // }
    return upNum + add + 1;
  }

  void debug(Object... obj) {
    System.err.println(java.util.Arrays.deepToString(obj));
  }

  int enemyNumber(int[] not) {
    int sum = 0;
    for (int i = 0; i < not.length; i++) {
      sum += not[i];
    }
    return sum;
  }

  int uppers(int[] scores, int[] not, int mine) {
    int sum = 0;
    for (int i = 0; i < not.length; i++) {
      if (scores[i] > mine) sum += not[i];
    }
    return sum;
  }

}
