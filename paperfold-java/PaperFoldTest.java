import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaperFoldTest {

    protected PaperFold solution;

    @Before
    public void setUp() {
        solution = new PaperFold();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] paper = new int[]{8, 11};
        int[] box = new int[]{6, 10};

        int expected = 1;
        int actual = solution.numFolds(paper, box);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] paper = new int[]{11, 17};
        int[] box = new int[]{6, 4};

        int expected = 4;
        int actual = solution.numFolds(paper, box);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] paper = new int[]{11, 17};
        int[] box = new int[]{5, 4};

        int expected = 4;
        int actual = solution.numFolds(paper, box);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] paper = new int[]{1000, 1000};
        int[] box = new int[]{62, 63};

        int expected = -1;
        int actual = solution.numFolds(paper, box);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] paper = new int[]{100, 30};
        int[] box = new int[]{60, 110};

        int expected = 0;
        int actual = solution.numFolds(paper, box);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] paper = new int[]{1895, 6416};
        int[] box = new int[]{401, 1000};

        int expected = 5;
        int actual = solution.numFolds(paper, box);

        Assert.assertEquals(expected, actual);
    }

}
