import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JumpingTest {

    protected Jumping solution;

    @Before
    public void setUp() {
        solution = new Jumping();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int x = 5;
        int y = 4;
        int[] jumpLengths = new int[]{2, 5};

        String expected = "Able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = new int[]{4};

        String expected = "Not able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = new int[]{6};

        String expected = "Not able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = new int[]{100, 100};

        String expected = "Able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int x = 300;
        int y = 400;
        int[] jumpLengths = new int[]{500};

        String expected = "Able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String expected = "Able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 100};

        String expected = "Not able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase7() {
        int x = -350;
        int y = 215;
        int[] jumpLengths = new int[]{711, 237};

        String expected = "Not able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase8() {
        int x = 456;
        int y = -572;
        int[] jumpLengths = new int[]{831, 141, 558, 679, 727, 504, 598, 409, 894, 989, 239, 86, 94, 189, 721, 212, 747, 388, 711, 210, 888, 669};

        String expected = "Able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase9() {
        int x = 10;
        int y = 10;
        int[] jumpLengths = new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};

        String expected = "Able";
        String actual = solution.ableToGet(x, y, jumpLengths);

        Assert.assertEquals(expected, actual);
    }
        
}
