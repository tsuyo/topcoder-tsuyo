import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CartInSupermarketEasyTest {

    protected CartInSupermarketEasy solution;

    @Before
    public void setUp() {
        solution = new CartInSupermarketEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 5;
        int K = 0;

        int expected = 5;
        int actual = solution.calc(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 5;
        int K = 2;

        int expected = 4;
        int actual = solution.calc(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 15;
        int K = 4;

        int expected = 6;
        int actual = solution.calc(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 7;
        int K = 100;

        int expected = 4;
        int actual = solution.calc(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 45;
        int K = 5;

        int expected = 11;
        int actual = solution.calc(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 100;
        int K = 100;

        int expected = 8;
        int actual = solution.calc(N, K);

        Assert.assertEquals(expected, actual);
    }

}
