import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InfiniteSequence2Test {

    protected InfiniteSequence2 solution;

    @Before
    public void setUp() {
        solution = new InfiniteSequence2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long n = 10000000L;
        int p = 2;
        int q = 3;
        int x = 10000000;
        int y = 10000000;

        long expected = 2L;
        long actual = solution.calc(n, p, q, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long n = 12L;
        int p = 2;
        int q = 3;
        int x = 1;
        int y = 0;

        long expected = 8L;
        long actual = solution.calc(n, p, q, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long n = 0L;
        int p = 2;
        int q = 2;
        int x = 0;
        int y = 0;

        long expected = 1L;
        long actual = solution.calc(n, p, q, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long n = 123L;
        int p = 45;
        int q = 67;
        int x = 8;
        int y = 9;

        long expected = 2L;
        long actual = solution.calc(n, p, q, x, y);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase4() {
        long n = 10000000000000L;
        int p = 2;
        int q = 2;
        int x = 0;
        int y = 0;

        long expected = 17592186044416L;
        long actual = solution.calc(n, p, q, x, y);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        long n = 10000000000000L;
        int p = 2;
        int q = 2;
        int x = 124342; 
        int y = 1138;

        long expected = 272433069L; 
        long actual = solution.calc(n, p, q, x, y);

        Assert.assertEquals(expected, actual);
    }

}
