import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CakesEqualizationTest {

    protected CakesEqualization solution;

    @Before
    public void setUp() {
        solution = new CakesEqualization();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] weights = new int[]{1, 3};
        int maxCuts = 2;

        double expected = 0.0;
        double actual = solution.fairDivision(weights, maxCuts);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] weights = new int[]{1, 1, 1, 1, 1};
        int maxCuts = 4;

        double expected = 0.0;
        double actual = solution.fairDivision(weights, maxCuts);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] weights = new int[]{1, 3};
        int maxCuts = 1;

        double expected = 0.5;
        double actual = solution.fairDivision(weights, maxCuts);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] weights = new int[]{7, 11, 13};
        int maxCuts = 10;

        double expected = 0.3999999999999999;
        double actual = solution.fairDivision(weights, maxCuts);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] weights = new int[]{13, 69, 41, 37, 80};
        int maxCuts = 27;

        double expected = 1.4666666666666668;
        double actual = solution.fairDivision(weights, maxCuts);

        assertEquals(expected, actual);
    }

}
