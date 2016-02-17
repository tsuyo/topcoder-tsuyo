import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BichromeBoardTest {

    protected BichromeBoard solution;

    @Before
    public void setUp() {
        solution = new BichromeBoard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"W?W", "??B", "???"};

        String expected = "Possible";
        String actual = solution.ableToDraw(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"W??W"};

        String expected = "Impossible";
        String actual = solution.ableToDraw(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"??"};

        String expected = "Possible";
        String actual = solution.ableToDraw(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"W???", "??B?", "W???", "???W"};

        String expected = "Possible";
        String actual = solution.ableToDraw(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"W???", "??B?", "W???", "?B?W"};

        String expected = "Impossible";
        String actual = solution.ableToDraw(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] board = new String[]{"B"};

        String expected = "Possible";
        String actual = solution.ableToDraw(board);

        Assert.assertEquals(expected, actual);
    }

}
