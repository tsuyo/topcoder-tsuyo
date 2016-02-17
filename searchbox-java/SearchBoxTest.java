import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchBoxTest {

	protected SearchBox solution;

	@Before
	public void setUp() {
		solution = new SearchBox();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String text = "We dont need no education";
		String search = "ed";
		String wholeWord = "N";
		int start = 13;

		int expected = 16;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String text = "We dont need no thought control";
		String search = "We";
		String wholeWord = "Y";
		int start = 0;

		int expected = 0;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String text = "No dark sarcasm in the classroom";
		String search = "The";
		String wholeWord = "Y";
		int start = 5;

		int expected = -1;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String text = "Teachers leave them kids alone";
		String search = "kid";
		String wholeWord = "Y";
		int start = 1;

		int expected = -1;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String text = "All in all its just another brick in the wall";
		String search = "all";
		String wholeWord = "Y";
		int start = 9;

		int expected = -1;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String text = "All in all youre just another brick in the wall";
		String search = "just";
		String wholeWord = "Y";
		int start = 17;

		int expected = 17;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		String text = "aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aa";
		String search = "aa";
		String wholeWord = "Y";
		int start = 1;

		int expected = 48;
		int actual = solution.find(text, search, wholeWord, start);

		Assert.assertEquals(expected, actual);
	}

}
