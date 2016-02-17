import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CafeteriaTest {

    protected Cafeteria solution;

    @Before
    public void setUp() {
        solution = new Cafeteria();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] offset = new int[]{9};
        int[] walkingTime = new int[]{1};
        int[] drivingTime = new int[]{1};

        String expected = "02:28";
        String actual = solution.latestTime(offset, walkingTime, drivingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] offset = new int[]{6};
        int[] walkingTime = new int[]{9};
        int[] drivingTime = new int[]{120};

        String expected = "12:17";
        String actual = solution.latestTime(offset, walkingTime, drivingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] offset = new int[]{6, 9};
        int[] walkingTime = new int[]{9, 10};
        int[] drivingTime = new int[]{120, 121};

        String expected = "12:19";
        String actual = solution.latestTime(offset, walkingTime, drivingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] offset = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] walkingTime = new int[]{11, 11, 11, 11, 11, 11, 11, 11, 11, 11};
        int[] drivingTime = new int[]{190, 190, 190, 190, 190, 190, 190, 190, 190, 190};

        String expected = "11:09";
        String actual = solution.latestTime(offset, walkingTime, drivingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] offset = new int[]{7, 4, 0, 0, 2, 1, 6, 7, 7, 0, 8, 6, 0, 5, 0, 6, 7, 9, 0, 2, 4, 8, 4, 7, 9, 2, 4, 4, 3, 1, 4, 5, 8, 8, 2, 5, 7, 8, 7, 5, 6, 8, 8, 0, 1, 3, 5, 0, 8};
        int[] walkingTime = new int[]{26, 14, 1, 4, 16, 28, 16, 6, 4, 5, 21, 18, 5, 2, 21, 21, 28, 22, 5, 22, 26, 16, 14, 19, 19, 19, 4, 12, 24, 4, 30, 16, 28, 20, 25, 2, 30, 18, 4, 6, 9, 22, 8, 3, 7, 29, 8, 30, 6};
        int[] drivingTime = new int[]{151, 264, 280, 89, 63, 57, 15, 120, 28, 296, 76, 269, 90, 106, 31, 222, 291, 52, 102, 73, 140, 248, 44, 187, 76, 49, 296, 106, 54, 119, 54, 283, 263, 285, 275, 127, 108, 82, 84, 241, 169, 203, 244, 256, 109, 288, 9, 262, 103};

        String expected = "02:07";
        String actual = solution.latestTime(offset, walkingTime, drivingTime);

        Assert.assertEquals(expected, actual);
    }

}
