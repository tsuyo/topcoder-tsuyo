import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BettingMoneyTest {

    protected BettingMoney solution;

    @Before
    public void setUp() {
        solution = new BettingMoney();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] amounts = new int[]{10, 20, 30};
        int[] centsPerDollar = new int[]{20, 30, 40};
        int finalResult = 1;

        int expected = 3400;
        int actual = solution.moneyMade(amounts, centsPerDollar, finalResult);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] amounts = new int[]{200, 300, 100};
        int[] centsPerDollar = new int[]{10, 10, 10};
        int finalResult = 2;

        int expected = 49000;
        int actual = solution.moneyMade(amounts, centsPerDollar, finalResult);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] amounts = new int[]{100, 100, 100, 100};
        int[] centsPerDollar = new int[]{5, 5, 5, 5};
        int finalResult = 0;

        int expected = 29500;
        int actual = solution.moneyMade(amounts, centsPerDollar, finalResult);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] amounts = new int[]{5000, 5000};
        int[] centsPerDollar = new int[]{100, 2};
        int finalResult = 0;

        int expected = 0;
        int actual = solution.moneyMade(amounts, centsPerDollar, finalResult);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] amounts = new int[]{100};
        int[] centsPerDollar = new int[]{10};
        int finalResult = 0;

        int expected = -1000;
        int actual = solution.moneyMade(amounts, centsPerDollar, finalResult);

        Assert.assertEquals(expected, actual);
    }

}
