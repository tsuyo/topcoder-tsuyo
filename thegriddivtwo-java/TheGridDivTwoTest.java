import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheGridDivTwoTest {

    protected TheGridDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheGridDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{1, 1, 1, 1};
        int[] y = new int[]{-2, -1, 0, 1};
        int k = 4;

        int expected = 2;
        int actual = solution.find(x, y, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{-1, 0, 0, 1};
        int[] y = new int[]{0, -1, 1, 0};
        int k = 9;

        int expected = 0;
        int actual = solution.find(x, y, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{};
        int[] y = new int[]{};
        int k = 1000;

        int expected = 1000;
        int actual = solution.find(x, y, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{1, 0, 0, -1, -1, -2, -2, -3, -3, -4, -4};
        int[] y = new int[]{0, -1, 1, -2, 2, -3, 3, -4, 4, -5, 5};
        int k = 47;

        int expected = 31;
        int actual = solution.find(x, y, k);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase4() {
        int[] x = new int[]{4, 5, 4, 0, 0, 0, 5, 3, 0, -1, -1, -2, 5, -2, 3, 0, 5, 5, 2, 3, -1, 1, 1, -2, 5, 2, 1, -1, 4, 4, 2, -1, 4, 1, 5, 1, -2, 3, 1, 1, 0, 1};
        int[] y = new int[]{1, 1, -1, 5, 3, -2, 3, 5, 2, -1, 2, 4, 4, 3, 2, 4, -1, 0, 4, -2, 1, 0, 5, -1, 2, 3, 2, 4, 2, 4, 0, 5, 0, 1, -2, -1, 5, 3, -2, 3, 1, 4};
        int k = 11;

        int expected = 2;
        int actual = solution.find(x, y, k);

        Assert.assertEquals(expected, actual);
    }

}
