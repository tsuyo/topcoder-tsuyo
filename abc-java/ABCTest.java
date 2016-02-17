import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ABCTest {

    protected ABC solution;

    @Before
    public void setUp() {
        solution = new ABC();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 3;
        int K = 3;

        String expected = "ABC";
        String actual = solution.createString(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 3;
        int K = 0;

        String expected = "CBA";
        String actual = solution.createString(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 5;
        int K = 10;

        String expected = "";
        String actual = solution.createString(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 15;
        int K = 36;

        String expected = "CABBACCBAABCBBB";
        String actual = solution.createString(N, K);

        Assert.assertEquals(expected, actual);
    }

}
