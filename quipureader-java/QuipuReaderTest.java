import static java.util.Arrays.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuipuReaderTest {

    protected QuipuReader solution;

    @Before
    public void setUp() {
        solution = new QuipuReader();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] knots = new String[]{"-XXXXXXX--XX-----XXXXX---", "---XX----XXX-----XXXX----", "-XXXXX---XXXXX--XXXXXXXX-"};

        int[] expected = new int[]{725, 234, 558};
        int[] actual = solution.readKnots(knots);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] knots = new String[]{"XX---XXXX", "XXX-----X"};

        int[] expected = new int[]{24, 31};
        int[] actual = solution.readKnots(knots);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] knots = new String[]{"-XXX---XX----X", "--X----X-XXXXX", "-XX--XXXX---XX"};

        int[] expected = new int[]{321, 115, 242};
        int[] actual = solution.readKnots(knots);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] knots = new String[]{"-------X--------", "--XXX----XXXX---", "--------------XX"};

        int[] expected = new int[]{100, 3040, 2};
        int[] actual = solution.readKnots(knots);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] knots = new String[]{"--XXX-XXXXXXXX----------XXXXXXXXX--XXXXXXXX-", "--XX----XXXX-----XXXXXX---XXX------XXXXXXXX-", "--------------------X----XXXXXXXX--XXXXXXXX-", "--XX-------X------XXXX----XXX-------XXXXXX--", "--XXX---XXXXX-------X------XX--------X------", "-XXXX--XXXXXXX-----------XXXXXXX----XXXXX---", "-----------X---XXXXXXXX----XX--------XXX----", "-----------X---XXXXXXXX----X----------------", "---X--XXXXXXXX--XXXXXXX---XXX---------------", "--XX---XXXXXXX--XXXXXXX----XX-------XXXXX---"};

        int[] expected = new int[]{38098, 24638, 188, 21436, 35121, 47075, 1823, 1810, 18730, 27725};
        int[] actual = solution.readKnots(knots);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] knots = new String[]{"X", "-"};

        int[] expected = new int[]{1, 0};
        int[] actual = solution.readKnots(knots);

        Assert.assertArrayEquals(expected, actual);
    }
    
    // added by TM
    @Test(timeout = 2000)
    public void testCase6() {
        String[] knots = new String[]{
        		"---------X----------------------",
        		"--------------------------------",
        		"---X----------------------------",
        		"-----------X--------------------",
        		"--X-----------------------------",
        		"--------------X-----------------",
        		"------------X-------------------",
        		"------X-------------------------"
        		};

        int[] expected = new int[]{1000, 0, 100000, 100, 1000000, 1, 10, 10000};
        int[] actual = solution.readKnots(knots);
        debug(actual);

        Assert.assertArrayEquals(expected, actual);
    }
    
    void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
