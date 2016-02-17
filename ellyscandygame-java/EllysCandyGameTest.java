import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EllysCandyGameTest {

    protected EllysCandyGame solution;

    @Before
    public void setUp() {
        solution = new EllysCandyGame();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] sweets = new int[]{20, 50, 70, 0, 30};

        String expected = "Kris";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] sweets = new int[]{42, 13, 7};

        String expected = "Elly";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] sweets = new int[]{10, 20};

        String expected = "Draw";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] sweets = new int[]{3, 1, 7, 11, 1, 1};

        String expected = "Kris";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] sweets = new int[]{41, 449, 328, 474, 150, 501, 467, 329, 536, 440};

        String expected = "Kris";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] sweets = new int[]{177, 131, 142, 171, 411, 391, 17, 222, 100, 298};

        String expected = "Elly";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }
    
    // added by TM
    @Test(timeout = 2000)
    public void testCase6() {
        int[] sweets = new int[]{0, 2, 4};

        String expected = "Draw";
        String actual = solution.getWinner(sweets);

        Assert.assertEquals(expected, actual);
    }

}
