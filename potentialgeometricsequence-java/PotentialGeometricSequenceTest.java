import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PotentialGeometricSequenceTest {

    protected PotentialGeometricSequence solution;

    @Before
    public void setUp() {
        solution = new PotentialGeometricSequence();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] d = new int[]{0, 1, 2};

        int expected = 6;
        int actual = solution.numberOfSubsequences(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] d = new int[]{1, 2, 4};

        int expected = 5;
        int actual = solution.numberOfSubsequences(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] d = new int[]{3, 2, 1, 0};

        int expected = 10;
        int actual = solution.numberOfSubsequences(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] d = new int[]{1, 2, 4, 8, 16};

        int expected = 9;
        int actual = solution.numberOfSubsequences(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] d = new int[]{1, 3, 5, 5, 5, 5, 64, 4, 23, 2, 3, 4, 5, 4, 3};

        int expected = 37;
        int actual = solution.numberOfSubsequences(d);

        Assert.assertEquals(expected, actual);
    }

}
