import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CuboidJoinTest {

	protected CuboidJoin solution;

	@Before
	public void setUp() {
		solution = new CuboidJoin();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] cuboids = new int[] { 0, 0, 0, 1, 1, 1 };

		long expected = 1L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] cuboids = new int[] { 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2 };

		long expected = 2L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] cuboids = new int[] { 0, 0, 0, 4, 4, 4, 0, 0, 0, 1, 1, 1 };

		long expected = 64L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] cuboids = new int[] { -5000, -5000, -5000, 5000, 5000, 5000 };

		long expected = 1000000000000L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] cuboids = new int[] { 0, 0, 0, 1, 2, 3, 5, 5, 5, 6, 6, 6 };

		long expected = 7L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] cuboids = new int[] {};

		long expected = 0L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		int[] cuboids = new int[] { 0, 0, 0, 1, 1, 0 };

		long expected = 0L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7() {
		int[] cuboids = new int[] { 437, -1775, -1847, 4588, -919, 2249, -1993,
				-3754, 2564, -349, -1525, 3332, -4675, 341, -2407, -1672, 4690,
				4987, -2529, 783, -3405, 3394, 3661, -54, -3085, -3169, -4386,
				4213, 1334, 1347 };

		long expected = 328240104918L;
		long actual = solution.totalVolume(cuboids);

		Assert.assertEquals(expected, actual);
	}
}
