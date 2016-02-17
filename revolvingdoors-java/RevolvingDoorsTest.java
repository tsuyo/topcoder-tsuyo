import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RevolvingDoorsTest {

    protected RevolvingDoors solution;

    @Before
    public void setUp() {
        solution = new RevolvingDoors();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] map = new String[]{"    ### ", "    #E# ", "   ## # ", "####  ##", "# S -O-#", "# ###  #", "#      #", "########"};

        int expected = 2;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] map = new String[]{"#### ", "#S|##", "# O #", "##|E#", " ####"};

        int expected = -1;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] map = new String[]{" |  |  |     |  |  |  |  |  | ", " O  O EO -O- O  O  O  O  OS O ", " |  |  |     |  |  |  |  |  | "};

        int expected = 7;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] map = new String[]{"###########", "#    #    #", "#  S | E  #", "#    O    #", "#    |    #", "#         #", "###########"};

        int expected = 0;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] map = new String[]{"        E", "    |    ", "    O    ", "    |    ", " -O-S-O- ", "    |    ", "    O    ", "    |    ", "         "};

        int expected = -1;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] map = new String[]{"##E#   ", "#  ##  ", " -O-## ", " #  ## ", " ##  ##", "  -O-  ", "##  ## ", " # ### ", " #  S  "};

        int expected = 5;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] map = new String[]{"#############", "#  #|##|#   #", "#   O  O    #", "# E || || S #", "#    O  O   #", "#   #|##|#  #", "#############"};

        int expected = 4;
        int actual = solution.turns(map);

        Assert.assertEquals(expected, actual);
    }

}
