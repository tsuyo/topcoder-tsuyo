import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareScoresDiv2Test {

    protected SquareScoresDiv2 solution;

    @Before
    public void setUp() {
        solution = new SquareScoresDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "aaaba";

        int expected = 8;
        int actual = solution.getscore(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "zzzxxzz";

        int expected = 12;
        int actual = solution.getscore(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "abcdefghijklmnopqrstuvwxyz";

        int expected = 26;
        int actual = solution.getscore(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "p";

        int expected = 1;
        int actual = solution.getscore(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        int expected = 5050;
        int actual = solution.getscore(s);

        Assert.assertEquals(expected, actual);
    }

}
