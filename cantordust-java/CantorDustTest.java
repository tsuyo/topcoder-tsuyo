import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CantorDustTest {

    protected CantorDust solution;

    @Before
    public void setUp() {
        solution = new CantorDust();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] pattern = new String[]{".X", ".."};
        int time = 1;

        int expected = 1;
        int actual = solution.occurrencesNumber(pattern, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] pattern = new String[]{".."};
        int time = 1;

        int expected = 2;
        int actual = solution.occurrencesNumber(pattern, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] pattern = new String[]{"."};
        int time = 2;

        int expected = 65;
        int actual = solution.occurrencesNumber(pattern, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] pattern = new String[]{"X...X"};
        int time = 2;

        int expected = 4;
        int actual = solution.occurrencesNumber(pattern, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] pattern = new String[]{"X"};
        int time = 9;

        int expected = 262144;
        int actual = solution.occurrencesNumber(pattern, time);

        Assert.assertEquals(expected, actual);
    }

}
