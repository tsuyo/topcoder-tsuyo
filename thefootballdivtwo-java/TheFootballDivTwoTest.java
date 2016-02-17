import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheFootballDivTwoTest {

    protected TheFootballDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheFootballDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int yourScore = 4;
        int[] scores = new int[]{7};
        int[] numberOfTeams = new int[]{1};

        int expected = 1;
        int actual = solution.find(yourScore, scores, numberOfTeams);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int yourScore = 1;
        int[] scores = new int[]{7};
        int[] numberOfTeams = new int[]{2};

        int expected = 2;
        int actual = solution.find(yourScore, scores, numberOfTeams);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int yourScore = 1;
        int[] scores = new int[]{7, 1};
        int[] numberOfTeams = new int[]{2, 1};

        int expected = 1;
        int actual = solution.find(yourScore, scores, numberOfTeams);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int yourScore = 11;
        int[] scores = new int[]{5, 12, 17, 19, 99, 13, 15, 14};
        int[] numberOfTeams = new int[]{2, 4, 8, 2, 1, 3, 25, 3};

        int expected = 18;
        int actual = solution.find(yourScore, scores, numberOfTeams);

        Assert.assertEquals(expected, actual);
    }

}
