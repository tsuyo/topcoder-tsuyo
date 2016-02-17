import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CutSticksTest {

    protected CutSticks solution;

    @Before
    public void setUp() {
        solution = new CutSticks();
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
        int[] sticks = new int[]{5, 8};
        int C = 1;
        int K = 1;

        double expected = 8.0;
        double actual = solution.maxKth(sticks, C, K);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] sticks = new int[]{5, 8};
        int C = 1;
        int K = 2;

        double expected = 5.0;
        double actual = solution.maxKth(sticks, C, K);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] sticks = new int[]{5, 8};
        int C = 1;
        int K = 3;

        double expected = 4.0;
        double actual = solution.maxKth(sticks, C, K);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] sticks = new int[]{1000000000, 1000000000, 1};
        int C = 2;
        int K = 5;

        double expected = 1.0;
        double actual = solution.maxKth(sticks, C, K);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] sticks = new int[]{76, 594, 17, 6984, 26, 57, 9, 876, 5816, 73, 969, 527, 49};
        int C = 789;
        int K = 456;

        double expected = 34.92;
        double actual = solution.maxKth(sticks, C, K);

        assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int[] sticks = new int[]{1000000000, 3, 1000000000, 64, 41570, 9, 1000000000, 8, 33, 266, 14, 594751, 7588, 66760, 436320, 41926, 851555, 240360775, 3641294, 6, 73664, 799405308, 91018, 254, 50541842, 35, 7195562, 59};
        int C = 1;
        int K = 29;

        double expected = 3.0;
        double actual = solution.maxKth(sticks, C, K);

        assertEquals(expected, actual);
    }

}
