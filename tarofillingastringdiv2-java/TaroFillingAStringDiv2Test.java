import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaroFillingAStringDiv2Test {

    protected TaroFillingAStringDiv2 solution;

    @Before
    public void setUp() {
        solution = new TaroFillingAStringDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "ABAA";

        int expected = 1;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "??";

        int expected = 0;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "A?A";

        int expected = 0;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "A??B???AAB?A???A";

        int expected = 3;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "?BB?BAAB???BAB?B?AAAA?ABBA????A?AAB?BBA?A?";

        int expected = 10;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

}
