import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GUMIAndSongsDiv2Test {

	protected GUMIAndSongsDiv2 solution;

	@Before
	public void setUp() {
		solution = new GUMIAndSongsDiv2();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] duration = new int[] { 3, 5, 4, 11 };
		int[] tone = new int[] { 2, 1, 3, 1 };
		int T = 17;

		int expected = 3;
		int actual = solution.maxSongs(duration, tone, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] duration = new int[] { 100, 200, 300 };
		int[] tone = new int[] { 1, 2, 3 };
		int T = 10;

		int expected = 0;
		int actual = solution.maxSongs(duration, tone, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] duration = new int[] { 1, 2, 3, 4 };
		int[] tone = new int[] { 1, 1, 1, 1 };
		int T = 100;

		int expected = 4;
		int actual = solution.maxSongs(duration, tone, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] duration = new int[] { 10, 10, 10 };
		int[] tone = new int[] { 58, 58, 58 };
		int T = 30;

		int expected = 3;
		int actual = solution.maxSongs(duration, tone, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] duration = new int[] { 8, 11, 7, 15, 9, 16, 7, 9 };
		int[] tone = new int[] { 3, 8, 5, 4, 2, 7, 4, 1 };
		int T = 14;

		int expected = 1;
		int actual = solution.maxSongs(duration, tone, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] duration = new int[] { 5611, 39996, 20200, 56574, 81643, 90131,
				33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
		int[] tone = new int[] { 2916, 53353, 64924, 86481, 44803, 61254,
				99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
		int T = 302606;

		int expected = 8;
		int actual = solution.maxSongs(duration, tone, T);

		Assert.assertEquals(expected, actual);
	}

}
