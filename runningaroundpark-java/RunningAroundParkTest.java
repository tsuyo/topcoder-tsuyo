import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunningAroundParkTest {

    protected RunningAroundPark solution;

    @Before
    public void setUp() {
        solution = new RunningAroundPark();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 3;
        int[] d = new int[]{1, 2, 3};

        int expected = 1;
        int actual = solution.numberOfLap(N, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 24;
        int[] d = new int[]{6, 6};

        int expected = 2;
        int actual = solution.numberOfLap(N, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 3;
        int[] d = new int[]{3, 2, 1};

        int expected = 3;
        int actual = solution.numberOfLap(N, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 50;
        int[] d = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int expected = 2;
        int actual = solution.numberOfLap(N, d);

        Assert.assertEquals(expected, actual);
    }

}
