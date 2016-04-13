import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimilarsTest {

    protected Similars solution;

    @Before
    public void setUp() {
        solution = new Similars();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int L = 1;
        int R = 10;

        int expected = 1;
        int actual = solution.maxsim(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int L = 1;
        int R = 99;

        int expected = 2;
        int actual = solution.maxsim(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int L = 99;
        int R = 100;

        int expected = 0;
        int actual = solution.maxsim(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int L = 1000;
        int R = 1010;

        int expected = 2;
        int actual = solution.maxsim(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int L = 444;
        int R = 454;

        int expected = 2;
        int actual = solution.maxsim(L, R);

        Assert.assertEquals(expected, actual);
    }

}
