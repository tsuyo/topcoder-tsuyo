import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodSubsetTest {

    protected GoodSubset solution;

    @Before
    public void setUp() {
        solution = new GoodSubset();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int goodValue = 10;
        int[] d = new int[]{2, 3, 4, 5};

        int expected = 1;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int goodValue = 6;
        int[] d = new int[]{2, 3, 4, 5, 6};

        int expected = 2;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int goodValue = 1;
        int[] d = new int[]{1, 1, 1};

        int expected = 7;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int goodValue = 12;
        int[] d = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expected = 6;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int goodValue = 5;
        int[] d = new int[]{1, 2, 3, 4};

        int expected = 0;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int goodValue = 1999999999;
        int[] d = new int[]{1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1999999999, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5454, 3434, 2323, 554};

        int expected = 79214383;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase6() {
        int goodValue = 1;
        int[] d = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int expected = 494092822;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase7() {
        int goodValue = 2000000000;
        int[] d = new int[]{2, 5, 10, 200, 400, 800, 1, 2, 100000, 10, 10, 10, 10, 20, 40, 10, 10, 10, 10, 10, 100, 1000, 100000, 2, 5, 10, 2, 5, 10, 200, 400, 800, 1, 2, 100000, 10, 10, 10, 40, 10, 10, 10, 10, 10, 100, 1000, 100000, 2, 5, 10, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 20000000, 200000000, 4000000, 5, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 16, 200000, 40000, 50000, 5000, 50, 2500, 80, 1, 1, 1, 1, 1, 1, 20000, 100000, 2000, 1000000, 1000, 1000, 20, 50, 50, 20};

        int expected = 839561307;
        int actual = solution.numberOfSubsets(goodValue, d);

        Assert.assertEquals(expected, actual);
    }

}
