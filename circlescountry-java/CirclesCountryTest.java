import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CirclesCountryTest {

    protected CirclesCountry solution;

    @Before
    public void setUp() {
        solution = new CirclesCountry();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] X = new int[]{0};
        int[] Y = new int[]{0};
        int[] R = new int[]{2};
        int x1 = -5;
        int y1 = 1;
        int x2 = 5;
        int y2 = 1;

        int expected = 0;
        int actual = solution.leastBorders(X, Y, R, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] X = new int[]{0, -6, 6};
        int[] Y = new int[]{0, 1, 2};
        int[] R = new int[]{2, 2, 2};
        int x1 = -5;
        int y1 = 1;
        int x2 = 5;
        int y2 = 1;

        int expected = 2;
        int actual = solution.leastBorders(X, Y, R, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] X = new int[]{1, -3, 2, 5, -4, 12, 12};
        int[] Y = new int[]{1, -1, 2, 5, 5, 1, 1};
        int[] R = new int[]{8, 1, 2, 1, 1, 1, 2};
        int x1 = -5;
        int y1 = 1;
        int x2 = 12;
        int y2 = 1;

        int expected = 3;
        int actual = solution.leastBorders(X, Y, R, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] X = new int[]{-3, 2, 2, 0, -4, 12, 12, 12};
        int[] Y = new int[]{-1, 2, 3, 1, 5, 1, 1, 1};
        int[] R = new int[]{1, 3, 1, 7, 1, 1, 2, 3};
        int x1 = 2;
        int y1 = 3;
        int x2 = 13;
        int y2 = 2;

        int expected = 5;
        int actual = solution.leastBorders(X, Y, R, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] X = new int[]{-107, -38, 140, 148, -198, 172, -179, 148, 176, 153, -56, -187};
        int[] Y = new int[]{175, -115, 23, -2, -49, -151, -52, 42, 0, 68, 109, -174};
        int[] R = new int[]{135, 42, 70, 39, 89, 39, 43, 150, 10, 120, 16, 8};
        int x1 = 102;
        int y1 = 16;
        int x2 = 19;
        int y2 = -108;

        int expected = 3;
        int actual = solution.leastBorders(X, Y, R, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

}
