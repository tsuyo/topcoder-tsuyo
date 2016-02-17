import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PoetryTest {

    protected Poetry solution;

    @Before
    public void setUp() {
        solution = new Poetry();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] poem = new String[]{"I hope this problem", "is a whole lot better than", "this stupid haiku"};

        String expected = "abc";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] poem = new String[]{"     ", "Measure your height", "AND WEIGHT      ", "said the doctor", "", "And make sure to take your pills", "   to   cure   your    ills", "Every", "DAY"};

        String expected = " aab ccde";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] poem = new String[]{"One bright day in the middle of the night", "Two dead boys got up to fight", "Back to back they faced each other", "Drew their swords and shot each other", "", "A deaf policeman heard the noise", "And came to arrest the two dead boys", "And if you dont believe this lie is true", "Ask the blind man he saw it too"};

        String expected = "aabb cdef";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] poem = new String[]{"", "", "", ""};

        String expected = "    ";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] poem = new String[]{"This poem has uppercase letters", "In its rhyme scheme", "Alpha", "Blaster", "Cat", "Desert", "Elephant", "Frog", "Gulch", "Horse", "Ireland", "Jam", "Krispy Kreme", "Loofah", "Moo", "Narf", "Old", "Pink", "Quash", "Rainbow", "Star", "Tour", "Uvula", "Very", "Will", "Xmas", "Young", "Zed", "deception", "comic", "grout", "oval", "cable", "rob", "steal", "steel", "weak"};

        String expected = "abcdefghibjkblmnopqrstcuvwxyzABCbDEFG";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] poem = new String[]{" ", "     ", "This poem", "         ", " ", " ", "", "Has lots of blank lines", " ", "      ", "                                            ", "         ", " ", "              ", "                                                  ", "  in      it           "};

        String expected = "  a    b       c";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] poem = new String[]{"too bad   your", "     solution went   sour"};

        String expected = "aa";
        String actual = solution.rhymeScheme(poem);

        Assert.assertEquals(expected, actual);
    }

}
