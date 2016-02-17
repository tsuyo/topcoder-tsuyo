import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlienAndPasswordTest {

    protected AlienAndPassword solution;

    @Before
    public void setUp() {
        solution = new AlienAndPassword();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "A";

        int expected = 1;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "ABA";

        int expected = 3;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "AABACCCCABAA";

        int expected = 7;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "AGAAGAHHHHFTQLLAPUURQQRRRUFJJSBSZVJZZZ";

        int expected = 26;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";

        int expected = 1;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

}
