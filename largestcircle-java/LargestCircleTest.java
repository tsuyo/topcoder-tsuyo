import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestCircleTest {

    protected LargestCircle solution;

    @Before
    public void setUp() {
        solution = new LargestCircle();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] grid = new String[]{"####", "#..#", "#..#", "####"};

        int expected = 1;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] grid = new String[]{"############", "###......###", "##.######.##", "#.########.#", "#.##..####.#", "#.##..####.#", "#.########.#", "#.########.#", "#.########.#", "##.######.##", "###......###", "############"};

        int expected = 5;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] grid = new String[]{".........."};

        int expected = 0;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] grid = new String[]{"#######", "#######", "#######", "#######", "#######"};

        int expected = 0;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] grid = new String[]{"#####.......", "#####.......", "#####.......", "............", "............", "............", "............", "............", "............", "............"};

        int expected = 4;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] grid = new String[]{"#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.", "...#...#...#...#...#...#...#...#...#...#...#...#..", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.", ".#...#...#...#...#...#...#...#...#...#...#...#...#", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.", "...#...#...#...#...#...#...#...#...#...#...#...#..", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.", ".#...#...#...#...#...#...#...#...#...#...#...#...#", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.", "...#...#...#...#...#...#...#...#...#...#...#...#.#", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#."};

        int expected = 0;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] grid = new String[]{".........................#........................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................."};

        int expected = 24;
        int actual = solution.radius(grid);

        Assert.assertEquals(expected, actual);
    }

}
