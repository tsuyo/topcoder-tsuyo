import java.util.*;

public class BracketExpressions {
  String[] K = { "(", ")", "[", "]", "{", "}" };
  String expression;

  public String ifPossible(String expression) {
    this.expression = expression;
    return rec("") ? "possible" : "impossible";
  }

  boolean rec(String state) {
    if (state.length() == 5) {
      char[] chs = expression.toCharArray();
      for (int i = 0, j = 0; i < chs.length; i++) {
        if (chs[i] == 'X') chs[i] = state.charAt(j++);
      }
      return exec(new String(chs));
    }
    boolean res = false;
    for (int i = 0; i < K.length; i++) {
      res |= rec(state + K[i]);
    }
    return res;
  }

  boolean exec(String expression) {
    char[] chs = expression.toCharArray();
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < chs.length; i++) {
      switch (chs[i]) {
      case ')':
        if (stack.size() == 0 || stack.pop() != '(') return false;
        break;
      case ']':
        if (stack.size() == 0 || stack.pop() != '[') return false;
        break;
      case '}':
        if (stack.size() == 0 || stack.pop() != '{') return false;
        break;
      default:
        stack.push(chs[i]);
      }
    }
    return (stack.size() == 0);
  }

}
