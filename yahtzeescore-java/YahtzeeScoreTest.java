import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YahtzeeScoreTest {

    protected YahtzeeScore solution;

    @Before
    public void setUp() {
        solution = new YahtzeeScore();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] toss = new int[]{2, 2, 3, 5, 4};

        int expected = 5;
        int actual = solution.maxPoints(toss);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] toss = new int[]{6, 4, 1, 1, 3};

        int expected = 6;
        int actual = solution.maxPoints(toss);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] toss = new int[]{5, 3, 5, 3, 3};

        int expected = 10;
        int actual = solution.maxPoints(toss);

        Assert.assertEquals(expected, actual);
    }

}
