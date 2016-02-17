import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KeyDungeonDiv2Test {

    protected KeyDungeonDiv2 solution;

    @Before
    public void setUp() {
        solution = new KeyDungeonDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] doorR = new int[]{2, 0, 5, 3};
        int[] doorG = new int[]{1, 4, 0, 2};
        int[] keys = new int[]{2, 3, 1};

        int expected = 3;
        int actual = solution.countDoors(doorR, doorG, keys);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] doorR = new int[]{0, 1, 2, 0};
        int[] doorG = new int[]{0, 2, 3, 1};
        int[] keys = new int[]{0, 0, 0};

        int expected = 1;
        int actual = solution.countDoors(doorR, doorG, keys);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] doorR = new int[]{3, 5, 4, 2, 8};
        int[] doorG = new int[]{4, 2, 3, 8, 1};
        int[] keys = new int[]{0, 0, 10};

        int expected = 5;
        int actual = solution.countDoors(doorR, doorG, keys);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] doorR = new int[]{4, 5, 4, 6, 8};
        int[] doorG = new int[]{2, 1, 2, 3, 5};
        int[] keys = new int[]{1, 2, 1};

        int expected = 0;
        int actual = solution.countDoors(doorR, doorG, keys);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] doorR = new int[]{41, 44, 41, 57, 58, 74, 84, 100, 58, 2, 43, 32, 82, 97, 44, 13, 35, 98, 96, 81, 43, 77, 18, 51, 27, 27, 39, 39, 45, 82, 59, 20, 28, 93, 6, 39, 64, 78, 28, 85, 17, 56, 3, 68, 4, 0, 36, 80, 41, 77};
        int[] doorG = new int[]{67, 15, 53, 36, 88, 29, 26, 57, 68, 99, 97, 27, 51, 70, 3, 49, 65, 75, 35, 92, 66, 0, 23, 96, 38, 86, 98, 31, 26, 75, 30, 2, 92, 78, 100, 99, 38, 26, 85, 74, 77, 15, 16, 48, 100, 88, 55, 93, 99, 54};
        int[] keys = new int[]{39, 31, 34};

        int expected = 17;
        int actual = solution.countDoors(doorR, doorG, keys);

        Assert.assertEquals(expected, actual);
    }

}
