import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TickTickTest {

    protected TickTick solution;

    @Before
    public void setUp() {
        solution = new TickTick();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] events = new String[]{".222", "00.223", "1.221", "4.220"};

        int expected = 4;
        int actual = solution.count(events);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] events = new String[]{"4.220112", "4.221", "4.222", "4.223"};

        int expected = 4;
        int actual = solution.count(events);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] events = new String[]{"123456.1", "123456.7"};

        int expected = 2;
        int actual = solution.count(events);

        Assert.assertEquals(expected, actual);
    }

}
