import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FloorBoardsTest {

    protected FloorBoards solution;

    @Before
    public void setUp() {
        solution = new FloorBoards();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] room = new String[]{".....", ".....", ".....", ".....", "....."};

        int expected = 5;
        int actual = solution.layout(room);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] room = new String[]{".......", ".#..##.", ".#.....", ".#####.", ".##..#.", "....###"};

        int expected = 7;
        int actual = solution.layout(room);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] room = new String[]{"####", "####", "####", "####"};

        int expected = 0;
        int actual = solution.layout(room);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] room = new String[]{"...#..", "##....", "#.#...", ".#....", "..#...", "..#..#"};

        int expected = 9;
        int actual = solution.layout(room);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] room = new String[]{".#....", "..#...", ".....#", "..##..", "......", ".#..#."};

        int expected = 9;
        int actual = solution.layout(room);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        String[] room = new String[]{"...", "...", "..."};

        int expected = 3;
        int actual = solution.layout(room);

        Assert.assertEquals(expected, actual);
    }

}
