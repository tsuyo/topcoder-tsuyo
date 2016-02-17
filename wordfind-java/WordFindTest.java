import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordFindTest {

    protected WordFind solution;

    @Before
    public void setUp() {
        solution = new WordFind();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] grid = new String[]{"TEST", "GOAT", "BOAT"};
        String[] wordList = new String[]{"GOAT", "BOAT", "TEST"};

        String[] expected = new String[]{"1 0", "2 0", "0 0"};
        String[] actual = solution.findWords(grid, wordList);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] grid = new String[]{"SXXX", "XQXM", "XXLA", "XXXR"};
        String[] wordList = new String[]{"SQL", "RAM"};

        String[] expected = new String[]{"0 0", ""};
        String[] actual = solution.findWords(grid, wordList);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] grid = new String[]{"EASYTOFINDEAGSRVHOTCJYG", "FLVENKDHCESOXXXXFAGJKEO", "YHEDYNAIRQGIZECGXQLKDBI", "DEIJFKABAQSIHSNDLOMYJIN", "CKXINIMMNGRNSNRGIWQLWOG", "VOFQDROQGCWDKOUYRAFUCDO", "PFLXWTYKOITSURQJGEGSPGG"};
        String[] wordList = new String[]{"EASYTOFIND", "DIAG", "GOING", "THISISTOOLONGTOFITINTHISPUZZLE"};

        String[] expected = new String[]{"0 0", "1 6", "0 22", ""};
        String[] actual = solution.findWords(grid, wordList);

        Assert.assertArrayEquals(expected, actual);
    }

}
