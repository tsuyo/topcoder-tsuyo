import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsMagicEasyTest {

    protected RockPaperScissorsMagicEasy solution;

    @Before
    public void setUp() {
        solution = new RockPaperScissorsMagicEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] card = new int[]{0, 1, 2};
        int score = 2;

        int expected = 6;
        int actual = solution.count(card, score);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] card = new int[]{1, 2};
        int score = 0;

        int expected = 4;
        int actual = solution.count(card, score);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] card = new int[]{2, 2, 1, 0, 0};
        int score = 10;

        int expected = 0;
        int actual = solution.count(card, score);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] card = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int score = 7;

        int expected = 286226628;
        int actual = solution.count(card, score);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] card = new int[]{0, 1, 2, 0, 1, 2, 2, 1, 0};
        int score = 8;

        int expected = 18;
        int actual = solution.count(card, score);

        Assert.assertEquals(expected, actual);
    }

}
