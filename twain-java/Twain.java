import static java.util.Arrays.*;

public class Twain {

	public String getNewSpelling(int year, String phrase) {
		String ans = phrase;
		if (year >= 1)
			ans = year1(ans);
		if (year >= 2)
			ans = year2(ans);
		if (year >= 3)
			ans = year3(ans);
		if (year >= 4)
			ans = year4(ans);
		if (year >= 5)
			ans = year5(ans);
		if (year >= 6)
			ans = year6(ans);
		if (year >= 7)
			ans = year7(ans);
		return ans;
	}

	String year1(String org) {
		return org.replaceAll("^x", "z").replaceAll("(\\s+)x", "$1z")
				.replaceAll("x", "ks");
	}

	String year2(String org) {
		return org.replaceAll("y", "i");
	}

	String year3(String org) {
		return org.replaceAll("ce", "se").replaceAll("ci", "si");
	}

	String year4(String org) {
		return org.replaceAll("c+k", "k");
	}

	String year5(String org) {
		return org.replaceAll("^sch", "sk").replaceAll("(\\s+)sch", "$1sk")
				.replaceAll("chr", "kr").replaceAll("c(?!h)", "k");
	}

	String year6(String org) {
		return org.replaceAll("^kn", "n").replaceAll("(\\s+)kn", "$1n");
	}

	String year7(String org) {
		return org.replaceAll("([b-df-hj-np-tv-z])\\1+", "$1");
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
