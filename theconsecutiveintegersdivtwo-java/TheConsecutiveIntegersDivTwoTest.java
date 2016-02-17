import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheConsecutiveIntegersDivTwoTest {

    protected TheConsecutiveIntegersDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheConsecutiveIntegersDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] numbers = new int[]{4, 47, 7};
        int k = 2;

        int expected = 2;
        int actual = solution.find(numbers, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] numbers = new int[]{1, 100};
        int k = 1;

        int expected = 0;
        int actual = solution.find(numbers, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] numbers = new int[]{-96, -53, 82, -24, 6, -75};
        int k = 2;

        int expected = 20;
        int actual = solution.find(numbers, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] numbers = new int[]{64, -31, -56};
        int k = 2;

        int expected = 24;
        int actual = solution.find(numbers, k);

        Assert.assertEquals(expected, actual);
    }

}
