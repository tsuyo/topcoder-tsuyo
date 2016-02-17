import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedalTableTest {

    protected MedalTable solution;

    @Before
    public void setUp() {
        solution = new MedalTable();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] results = new String[]{"ITA JPN AUS", "KOR TPE UKR", "KOR KOR GBR", "KOR CHN TPE"};

        String[] expected = new String[]{"KOR 3 1 0", "ITA 1 0 0", "TPE 0 1 1", "CHN 0 1 0", "JPN 0 1 0", "AUS 0 0 1", "GBR 0 0 1", "UKR 0 0 1"};
        String[] actual = solution.generate(results);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] results = new String[]{"USA AUT ROM"};

        String[] expected = new String[]{"USA 1 0 0", "AUT 0 1 0", "ROM 0 0 1"};
        String[] actual = solution.generate(results);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] results = new String[]{"GER AUT SUI", "AUT SUI GER", "SUI GER AUT"};

        String[] expected = new String[]{"AUT 1 1 1", "GER 1 1 1", "SUI 1 1 1"};
        String[] actual = solution.generate(results);

        Assert.assertArrayEquals(expected, actual);
    }

}
