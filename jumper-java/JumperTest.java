import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JumperTest {

    protected Jumper solution;

    @Before
    public void setUp() {
        solution = new Jumper();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] patterns = new String[]{"###..", "..###"};
        int[] speeds = new int[]{1, 1};
        String rows = "01";

        int expected = 5;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] patterns = new String[]{"###..", "..###"};
        int[] speeds = new int[]{5, 5};
        String rows = "01";

        int expected = 5;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] patterns = new String[]{"....#", "....#"};
        int[] speeds = new int[]{4, 5};
        String rows = "0111";

        int expected = 9;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] patterns = new String[]{"#....", "#...."};
        int[] speeds = new int[]{-4, -5};
        String rows = "0111";

        int expected = 24;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] patterns = new String[]{"#####", "#####"};
        int[] speeds = new int[]{10, 10};
        String rows = "01";

        int expected = -1;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] patterns = new String[]{"#####", "#####", "....."};
        int[] speeds = new int[]{1, -1, 1};
        String rows = "01010101010101010102";

        int expected = -1;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] patterns = new String[]{"#....", "#....", "#...."};
        int[] speeds = new int[]{5, -5, 6};
        String rows = "2012";

        int expected = 12;
        int actual = solution.minTime(patterns, speeds, rows);

        Assert.assertEquals(expected, actual);
    }

}
