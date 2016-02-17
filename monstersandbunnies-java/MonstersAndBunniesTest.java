import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonstersAndBunniesTest {

    protected MonstersAndBunnies solution;

    @Before
    public void setUp() {
        solution = new MonstersAndBunnies();
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
        int M = 0;
        int B = 0;

        double expected = 1.0;
        double actual = solution.survivalProbability(M, B);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int M = 0;
        int B = 47;

        double expected = 1.0;
        double actual = solution.survivalProbability(M, B);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int M = 1;
        int B = 0;

        double expected = 0.0;
        double actual = solution.survivalProbability(M, B);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int M = 1;
        int B = 47;

        double expected = 0.0;
        double actual = solution.survivalProbability(M, B);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int M = 2;
        int B = 0;

        double expected = 0.3333333333333333;
        double actual = solution.survivalProbability(M, B);

        assertEquals(expected, actual);
    }

}
