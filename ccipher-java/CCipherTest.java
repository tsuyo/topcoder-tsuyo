import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CCipherTest {

    protected CCipher solution;

    @Before
    public void setUp() {
        solution = new CCipher();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String cipherText = "VQREQFGT";
        int shift = 2;

        String expected = "TOPCODER";
        String actual = solution.decode(cipherText, shift);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String cipherText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int shift = 10;

        String expected = "QRSTUVWXYZABCDEFGHIJKLMNOP";
        String actual = solution.decode(cipherText, shift);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String cipherText = "TOPCODER";
        int shift = 0;

        String expected = "TOPCODER";
        String actual = solution.decode(cipherText, shift);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String cipherText = "ZWBGLZ";
        int shift = 25;

        String expected = "AXCHMA";
        String actual = solution.decode(cipherText, shift);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String cipherText = "DBNPCBQ";
        int shift = 1;

        String expected = "CAMOBAP";
        String actual = solution.decode(cipherText, shift);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String cipherText = "LIPPSASVPH";
        int shift = 4;

        String expected = "HELLOWORLD";
        String actual = solution.decode(cipherText, shift);

        Assert.assertEquals(expected, actual);
    }

}
