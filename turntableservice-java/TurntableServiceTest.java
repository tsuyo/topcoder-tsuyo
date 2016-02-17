import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TurntableServiceTest {

	protected TurntableService solution;

	@Before
	public void setUp() {
		solution = new TurntableService();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] favorites = new String[] { "0 2", "1", "0 1" };

		int expected = 32;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] favorites = new String[] { "0", "0", "0" };

		int expected = 49;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] favorites = new String[] { "4", "1", "2", "3", "0" };

		int expected = 50;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] favorites = new String[] { "0 004", "2 3", "0 01", "1 2 3 4",
				"1 1" };

		int expected = 35;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

	// added by TM
	@Test(timeout = 2000)
	public void testCase4() {
		String[] favorites = new String[] { "4", "9", "13", "10", "3", "11",
				"8", "10", "3", "3", "10", "12", "9", "11", "4" };

		int expected = 253;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

	// added by TM
	@Test(timeout = 2000)
	public void testCase5() {
		String[] favorites = new String[] { "2", "9", "1", "13", "1", "8", "0",
				"7", "0", "10", "14", "1", "3", "9", "12" };

		int expected = 253;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

	// added by TM
	@Test(timeout = 2000)
	public void testCase6() {
		String[] favorites = new String[] { "6 6 11", "11 8 13", "0 0 12 6",
				"8 1 0 7 0", "8 2 4", "8", "8 5 13", "2 4", "6", "0 6 7 0",
				"9 13", "7 14 6 10 5", "14 1 14", "14 2 0 11", "9 9 4 5" };

		int expected = 91;
		int actual = solution.calculateTime(favorites);

		Assert.assertEquals(expected, actual);
	}

}
