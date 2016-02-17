import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountryGroupTest {

    protected CountryGroup solution;

    @Before
    public void setUp() {
        solution = new CountryGroup();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] a = new int[]{2, 2, 3, 3, 3};

        int expected = 2;
        int actual = solution.solve(a);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] a = new int[]{1, 1, 1, 1, 1};

        int expected = 5;
        int actual = solution.solve(a);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] a = new int[]{3, 3};

        int expected = -1;
        int actual = solution.solve(a);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] a = new int[]{4, 4, 4, 4, 1, 1, 2, 2, 3, 3, 3};

        int expected = 5;
        int actual = solution.solve(a);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] a = new int[]{2, 1, 2, 2, 1, 2};

        int expected = -1;
        int actual = solution.solve(a);

        Assert.assertEquals(expected, actual);
    }

}
