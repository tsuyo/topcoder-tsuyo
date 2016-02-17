public class BichromeBoard {

  public String ableToDraw(String[] board) {
    char[][] B = new char[board.length][];
    for (int i = 0; i < board.length; i++) {
      B[i] = board[i].toCharArray();
    }
    int H = board.length;
    int W = board[0].length();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (i == 0 && j == 0) continue;
        if (B[i][j] == '?') {
          // left
          if (j >= 1 && B[i][j - 1] == 'W') {
            B[i][j] = 'B';
          } else if (j >= 1 && B[i][j - 1] == 'B') {
            B[i][j] = 'W';
          }
          // upper
          if (i >= 1 && B[i - 1][j] == 'W') {
            B[i][j] = 'B';
          } else if (i >= 1 && B[i - 1][j] == 'B') {
            B[i][j] = 'W';
          }
        } else if (B[i][j] == 'W') {
          // left
          if (j >= 1 && B[i][j - 1] == 'W') {
            return "Impossible";
          } else if (j >= 1 && B[i][j - 1] == '?') {
            B[i][j - 1] = 'B';
          }
          // upper
          if (i >= 1 && B[i - 1][j] == 'W') {
            return "Impossible";
          } else if (i >= 1 && B[i - 1][j] == '?') {
            B[i - 1][j] = 'B';
          }
        } else { // B[i][j] == 'B'
          // left
          if (j >= 1 && B[i][j - 1] == 'B') {
            return "Impossible";
          } else if (j >= 1 && B[i][j - 1] == '?') {
            B[i][j - 1] = 'W';
          }
          // upper
          if (i >= 1 && B[i - 1][j] == 'B') {
            return "Impossible";
          } else if (i >= 1 && B[i - 1][j] == '?') {
            B[i - 1][j] = 'W';
          }
        }
      }
    }
    return "Possible";
  }

}
