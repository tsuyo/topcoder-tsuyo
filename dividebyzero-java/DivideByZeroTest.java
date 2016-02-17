import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideByZeroTest {

    protected DivideByZero solution;

    @Before
    public void setUp() {
        solution = new DivideByZero();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] numbers = new int[]{9, 2};

        int expected = 3;
        int actual = solution.CountNumbers(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] numbers = new int[]{8, 2};

        int expected = 3;
        int actual = solution.CountNumbers(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] numbers = new int[]{50};

        int expected = 1;
        int actual = solution.CountNumbers(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] numbers = new int[]{1, 5, 8, 30, 15, 4};

        int expected = 11;
        int actual = solution.CountNumbers(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] numbers = new int[]{1, 2, 4, 8, 16, 32, 64};

        int expected = 7;
        int actual = solution.CountNumbers(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] numbers = new int[]{6, 2, 18};

        int expected = 7;
        int actual = solution.CountNumbers(numbers);

        Assert.assertEquals(expected, actual);
    }

}
