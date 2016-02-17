import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordFormTest {

    protected WordForm solution;

    @Before
    public void setUp() {
        solution = new WordForm();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String word = "WHEREABOUTS";

        String expected = "CVCVCVC";
        String actual = solution.getSequence(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String word = "yoghurt";

        String expected = "CVCVC";
        String actual = solution.getSequence(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String word = "YipPy";

        String expected = "CVCV";
        String actual = solution.getSequence(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String word = "AyYyEYye";

        String expected = "VCVCVCV";
        String actual = solution.getSequence(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String word = "yC";

        String expected = "C";
        String actual = solution.getSequence(word);

        Assert.assertEquals(expected, actual);
    }

}
