import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoldingPaper2Test {

    protected FoldingPaper2 solution;

    @Before
    public void setUp() {
        solution = new FoldingPaper2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int W = 5;
        int H = 3;
        int A = 12;

        int expected = 1;
        int actual = solution.solve(W, H, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int W = 2;
        int H = 2;
        int A = 3;

        int expected = -1;
        int actual = solution.solve(W, H, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int W = 4;
        int H = 4;
        int A = 1;

        int expected = 4;
        int actual = solution.solve(W, H, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int W = 127;
        int H = 129;
        int A = 72;

        int expected = 8;
        int actual = solution.solve(W, H, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int W = 1;
        int H = 100000;
        int A = 100000;

        int expected = 0;
        int actual = solution.solve(W, H, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int W = 1;
        int H = 1;
        int A = 2;

        int expected = -1;
        int actual = solution.solve(W, H, A);

        Assert.assertEquals(expected, actual);
    }

}
