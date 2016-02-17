import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceGamesTest {

    protected DiceGames solution;

    @Before
    public void setUp() {
        solution = new DiceGames();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] sides = new int[]{4};

        long expected = 4L;
        long actual = solution.countFormations(sides);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] sides = new int[]{2, 2};

        long expected = 3L;
        long actual = solution.countFormations(sides);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] sides = new int[]{4, 4};

        long expected = 10L;
        long actual = solution.countFormations(sides);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] sides = new int[]{3, 4};

        long expected = 9L;
        long actual = solution.countFormations(sides);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] sides = new int[]{4, 5, 6};

        long expected = 48L;
        long actual = solution.countFormations(sides);

        Assert.assertEquals(expected, actual);
    }

}
