import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddMultiplyTest {

  protected AddMultiply solution;

  @Before
  public void setUp() {
    solution = new AddMultiply();
  }

  private void check(int y, int[] actual) {
    Assert.assertEquals(3, actual.length);
    for (int i = 0; i < actual.length; i++) {
      if (actual[i] < -1000 || actual[i] > 1000) Assert.fail();
    }
    int L = (actual[0] * actual[1]) + actual[2];
    Assert.assertEquals(y, L);
  }

  @Test(timeout = 2000)
  public void testCase0() {
    int y = 6;

    int[] expected = new int[] { 2, 2, 2 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

  @Test(timeout = 2000)
  public void testCase1() {
    int y = 11;

    int[] expected = new int[] { 2, 3, 5 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

  @Test(timeout = 2000)
  public void testCase2() {
    int y = 0;

    int[] expected = new int[] { 7, 10, -70 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

  @Test(timeout = 2000)
  public void testCase3() {
    int y = 500;

    int[] expected = new int[] { -400, -3, -700 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

  @Test(timeout = 2000)
  public void testCase4() {
    int y = 2;

    int[] expected = new int[] { 2, 2, -2 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

  @Test(timeout = 2000)
  public void testCase5() {
    int y = 5;

    int[] expected = new int[] { 5, 2, -5 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

  @Test(timeout = 2000)
  public void testCase6() {
    int y = 9;

    int[] expected = new int[] { -1, -1, 8 };
    int[] actual = solution.makeExpression(y);

    // Assert.assertArrayEquals(expected, actual);
    check(y, actual);
  }

}
