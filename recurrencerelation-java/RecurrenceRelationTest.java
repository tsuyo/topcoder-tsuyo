import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecurrenceRelationTest {

    protected RecurrenceRelation solution;

    @Before
    public void setUp() {
        solution = new RecurrenceRelation();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] coefficients = new int[]{2, 1};
        int[] initial = new int[]{9, 7};
        int N = 6;

        int expected = 5;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] coefficients = new int[]{1, 1};
        int[] initial = new int[]{0, 1};
        int N = 9;

        int expected = 4;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] coefficients = new int[]{2};
        int[] initial = new int[]{1};
        int N = 20;

        int expected = 6;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] coefficients = new int[]{2};
        int[] initial = new int[]{1};
        int N = 64;

        int expected = 6;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] coefficients = new int[]{25, 143};
        int[] initial = new int[]{0, 0};
        int N = 100000;

        int expected = 0;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] coefficients = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] initial = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = 654;

        int expected = 5;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] coefficients = new int[]{901, 492, 100};
        int[] initial = new int[]{-6, -15, -39};
        int N = 0;

        int expected = 4;
        int actual = solution.moduloTen(coefficients, initial, N);

        Assert.assertEquals(expected, actual);
    }

}
