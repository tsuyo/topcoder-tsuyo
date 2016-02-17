import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserNameTest {

    protected UserName solution;

    @Before
    public void setUp() {
        solution = new UserName();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] existingNames = new String[]{"MasterOfDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"};
        String newName = "TygerTyger";

        String expected = "TygerTyger";
        String actual = solution.newMember(existingNames, newName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] existingNames = new String[]{"MasterOfDisaster", "TygerTyger1", "DingBat", "Orpheus", "TygerTyger", "WolfMan", "MrKnowItAll"};
        String newName = "TygerTyger";

        String expected = "TygerTyger2";
        String actual = solution.newMember(existingNames, newName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] existingNames = new String[]{"TygerTyger2000", "TygerTyger1", "MasterDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"};
        String newName = "TygerTyger";

        String expected = "TygerTyger";
        String actual = solution.newMember(existingNames, newName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] existingNames = new String[]{"grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", "grokster", "Elemental", "NightShade", "Grokster1"};
        String newName = "grokster";

        String expected = "grokster1";
        String actual = solution.newMember(existingNames, newName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] existingNames = new String[]{"Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10", "Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3", "Bart11", "Bart12"};
        String newName = "Bart";

        String expected = "Bart13";
        String actual = solution.newMember(existingNames, newName);

        Assert.assertEquals(expected, actual);
    }

}
