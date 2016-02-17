import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NoOrderOfOperationsTest {

    protected NoOrderOfOperations solution;

    @Before
    public void setUp() {
        solution = new NoOrderOfOperations();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String expr = "3+5*7";

        int expected = 56;
        int actual = solution.evaluate(expr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String expr = "4-8*9*1";

        int expected = -36;
        int actual = solution.evaluate(expr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String expr = "0";

        int expected = 0;
        int actual = solution.evaluate(expr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String expr = "1*2*3*4*5*6*7*8*9";

        int expected = 362880;
        int actual = solution.evaluate(expr);

        Assert.assertEquals(expected, actual);
    }

}
