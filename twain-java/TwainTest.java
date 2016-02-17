import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwainTest {

    protected Twain solution;

    @Before
    public void setUp() {
        solution = new Twain();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int year = 1;
        String phrase = "i fixed the chrome xerox by the cyclical church";

        String expected = "i fiksed the chrome zeroks by the cyclical church";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int year = 2;
        String phrase = "i fixed the chrome xerox by the cyclical church";

        String expected = "i fiksed the chrome zeroks bi the ciclical church";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int year = 0;
        String phrase = "this is unchanged";

        String expected = "this is unchanged";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int year = 7;
        String phrase = "sch kn x xschrx cknnchc cyck xxceci";

        String expected = "sk n z zskrks nchk sik zksesi";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int year = 7;
        String phrase = "  concoction   convalescence   cyclical   cello   ";

        String expected = "  konkoktion   konvalesense   siklikal   selo   ";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int year = 7;
        String phrase = "";

        String expected = "";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int year = 7;
        String phrase = "cck xzz aaaaa";

        String expected = "k z aaaaa";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }
    
    // added by TM
    @Test(timeout = 2000)
    public void testCase7() {
        int year = 7;
        String phrase = "aabbccddeeffgghhiijjkkll";

        String expected = "aabkdeefghiijkl";
        String actual = solution.getNewSpelling(year, phrase);

        Assert.assertEquals(expected, actual);
    }

}
