import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatchMakingTest {

    protected MatchMaking solution;

    @Before
    public void setUp() {
        solution = new MatchMaking();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] namesWomen = new String[]{"Constance", "Bertha", "Alice"};
        String[] answersWomen = new String[]{"aaba", "baab", "aaaa"};
        String[] namesMen = new String[]{"Chip", "Biff", "Abe"};
        String[] answersMen = new String[]{"bbaa", "baaa", "aaab"};
        String queryWoman = "Bertha";

        String expected = "Biff";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] namesWomen = new String[]{"Constance", "Bertha", "Alice"};
        String[] answersWomen = new String[]{"aaba", "baab", "aaaa"};
        String[] namesMen = new String[]{"Chip", "Biff", "Abe"};
        String[] answersMen = new String[]{"bbaa", "baaa", "aaab"};
        String queryWoman = "Constance";

        String expected = "Chip";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] namesWomen = new String[]{"Constance", "Alice", "Bertha", "Delilah", "Emily"};
        String[] answersWomen = new String[]{"baabaa", "ababab", "aaabbb", "bababa", "baabba"};
        String[] namesMen = new String[]{"Ed", "Duff", "Chip", "Abe", "Biff"};
        String[] answersMen = new String[]{"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"};
        String queryWoman = "Constance";

        String expected = "Duff";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] namesWomen = new String[]{"Constance", "Alice", "Bertha", "Delilah", "Emily"};
        String[] answersWomen = new String[]{"baabaa", "ababab", "aaabbb", "bababa", "baabba"};
        String[] namesMen = new String[]{"Ed", "Duff", "Chip", "Abe", "Biff"};
        String[] answersMen = new String[]{"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"};
        String queryWoman = "Delilah";

        String expected = "Chip";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] namesWomen = new String[]{"Constance", "Alice", "Bertha", "Delilah", "Emily"};
        String[] answersWomen = new String[]{"baabaa", "ababab", "aaabbb", "bababa", "baabba"};
        String[] namesMen = new String[]{"Ed", "Duff", "Chip", "Abe", "Biff"};
        String[] answersMen = new String[]{"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"};
        String queryWoman = "Emily";

        String expected = "Ed";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] namesWomen = new String[]{"anne", "Zoe"};
        String[] answersWomen = new String[]{"a", "a"};
        String[] namesMen = new String[]{"bob", "chuck"};
        String[] answersMen = new String[]{"a", "a"};
        String queryWoman = "Zoe";

        String expected = "bob";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] namesWomen = new String[]{"F", "M", "S", "h", "q", "g", "r", "N", "U", "x", "H", "P", "o", "E", "R", "z", "L", "m", "e", "u", "K", "A", "w", "Q", "O", "v", "j", "a", "t", "p", "C", "G", "k", "c", "V", "B", "D", "s", "n", "i", "f", "T", "I", "l", "d", "J", "y", "b"};
        String[] answersWomen = new String[]{"abaabbbb", "bbaabbbb", "aaabaaab", "aabbaaaa", "baabbaab", "aaababba", "bbabbbbb", "bbbabbba", "aaabbbba", "aabbbaaa", "abbabaaa", "babbabbb", "aaaaabba", "aaaabbaa", "abbbabaa", "babababa", "abbaaaaa", "bbababba", "baaaaaba", "baaaaabb", "bbbbabba", "ababbaaa", "abbbabab", "baabbbaa", "bbbaabbb", "aababbab", "ababbabb", "abbaabba", "baabbabb", "aaabaaab", "aabbbaba", "aabaaabb", "abababba", "aabbaaaa", "aabbabaa", "bababaaa", "aabaaaab", "bbbbaabb", "baaababb", "abaabbab", "aabbbaaa", "baabbaba", "bbabbbaa", "aabbbbaa", "abbbaaab", "abababbb", "ababaaba", "bababaaa"};
        String[] namesMen = new String[]{"f", "C", "v", "g", "Q", "z", "n", "c", "B", "o", "M", "F", "u", "x", "I", "T", "K", "L", "E", "U", "w", "A", "d", "t", "e", "R", "D", "s", "p", "q", "m", "r", "H", "j", "J", "V", "l", "a", "k", "h", "G", "y", "i", "P", "O", "N", "b", "S"};
        String[] answersMen = new String[]{"bbbaabab", "bbabaabb", "ababbbbb", "bbbababb", "baababaa", "bbaaabab", "abbabbaa", "bbbabbbb", "aabbabab", "abbababa", "aababbbb", "bababaab", "aaababbb", "baabbaba", "abaaaaab", "bbaababa", "babaabab", "abbabbba", "ababbbab", "baabbbab", "babbaaab", "abbbbaba", "bbabbbba", "baaabaab", "ababbabb", "abbbaabb", "bbbbaabb", "bbbaaabb", "baabbaba", "bbabaaab", "aabbbaab", "abbbbabb", "bbaaaaba", "bbbababa", "abbaabba", "bababbbb", "aabaaabb", "babbabab", "baaaabaa", "ababbaba", "aaabaabb", "bbaaabaa", "baaaaabb", "bbaabaab", "bbababab", "aabaaaab", "aaaaabab", "aabbaaba"};
        String queryWoman = "U";

        String expected = "x";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        String[] namesWomen = new String[]{"q", "M", "w", "y", "p", "N", "s", "r", "a", "H", "o", "n", "F", "m", "l", "b", "D", "j", "C", "u", "f", "I", "g", "L", "i", "x", "A", "G", "O", "k", "h", "d", "c", "E", "B", "v", "J", "z", "K", "e", "t"};
        String[] answersWomen = new String[]{"aabbaaabb", "baabababb", "bbaababba", "bbbaaaaaa", "abaaaabaa", "bababbbab", "abbaabbaa", "aabababbb", "bababaaaa", "abbababaa", "aabbbbbba", "bbabbabab", "babaabbba", "babbabbbb", "baaabbbbb", "baaabaaaa", "aaabbaaab", "abbaabbbb", "abbabbbab", "bbaaaabba", "babbaaabb", "aabbabbab", "baaababba", "ababaabab", "bbbaabbab", "aaaabbabb", "babaaaaaa", "abbbbaaab", "aabaaabba", "bbbaaaaba", "bbbbbbaab", "aabbaaabb", "aabaabbab", "aababaaba", "bbabbbbab", "abbabaaab", "babaaabbb", "bababbaaa", "aabbaabaa", "baaabbabb", "bbbbbbbbb"};
        String[] namesMen = new String[]{"m", "k", "n", "q", "L", "E", "M", "l", "w", "x", "g", "e", "i", "z", "F", "r", "a", "h", "f", "D", "J", "K", "j", "v", "A", "t", "N", "y", "s", "c", "o", "p", "d", "b", "B", "G", "O", "I", "u", "C", "H"};
        String[] answersMen = new String[]{"bbaaabbba", "bbaaaaaab", "abaaababb", "baaaabbbb", "abbbababa", "baaaaaaaa", "aabbbbbab", "aaaaabbba", "baabababb", "babaaabab", "baaababaa", "bbbbaabba", "bbaabbabb", "bbaaababb", "abbabbaba", "aababaaab", "abbbbbbaa", "aabbaabaa", "bbbaabbba", "abbabbaba", "aaabbbaaa", "bbaabaaaa", "aabababbb", "abbbbabab", "baaabbbba", "bababbbba", "aababbaab", "bbaabbaab", "bbbaaabbb", "babbbbabb", "ababababb", "babaaabab", "bbaaaaaba", "aaaaabaaa", "abbaaabbb", "bbbbababb", "baabababb", "bbaabaaaa", "aaababbbb", "abbbbbbba", "bbaabbaaa"};
        String queryWoman = "o";

        String expected = "C";
        String actual = solution.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);

        Assert.assertEquals(expected, actual);
    }

}
