import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryFlipsTest {

    protected BinaryFlips solution;

    @Before
    public void setUp() {
        solution = new BinaryFlips();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int A = 3;
        int B = 0;
        int K = 3;

        int expected = 1;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int A = 4;
        int B = 0;
        int K = 3;

        int expected = 4;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int A = 4;
        int B = 1;
        int K = 3;

        int expected = 2;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int A = 3;
        int B = 2;
        int K = 5;

        int expected = -1;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int A = 100000;
        int B = 100000;
        int K = 578;

        int expected = 174;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int A = 0;
        int B = 0;
        int K = 1;

        int expected = 0;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int A = 4;
        int B = 44;
        int K = 50;

        int expected = -1;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }
    
    // added by TM
    @Test(timeout = 2000)
    public void testCase7() {
        int A = 16969;
        int B = 98999;
        int K = 9999;

        int expected = 3;
        int actual = solution.minimalMoves(A, B, K);

        Assert.assertEquals(expected, actual);
    }

}
