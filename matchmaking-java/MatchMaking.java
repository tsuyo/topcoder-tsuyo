import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Woman implements Comparable<Woman> {
	String name;
	String ans;

	public Woman(String n, String a) {
		this.name = n;
		this.ans = a;
	}

	public int compareTo(Woman o) {
		return name.compareTo(o.name);
	}
}

class Man implements Comparable<Man> {
	String name;
	int index;
	int match;

	public Man(String n, int ind, String ans, String wans) {
		this.name = n;
		this.index = ind;
		char[] ansc = ans.toCharArray();
		char[] wansc = wans.toCharArray();
		for (int i = 0; i < ansc.length; i++) {
			if (ansc[i] == wansc[i])
				match++;
		}
	}

	public int compareTo(Man o) {
		if (match != o.match)
			return o.match - match;
		return name.compareTo(o.name);
	}
}

public class MatchMaking {

	public String makeMatch(String[] namesWomen, String[] answersWomen,
			String[] namesMen, String[] answersMen, String queryWoman) {
		List<Woman> wlist = new ArrayList<Woman>();
		for (int i = 0; i < namesWomen.length; i++) {
			wlist.add(new Woman(namesWomen[i], answersWomen[i]));
		}
		Collections.sort(wlist);
		boolean[] used = new boolean[namesMen.length];
		String manName = null;
		for (Woman woman : wlist) {
			List<Man> list = new ArrayList<Man>();
			for (int j = 0; j < namesMen.length; j++) {
				list.add(new Man(namesMen[j], j, answersMen[j], woman.ans));
			}
			Collections.sort(list);

			for (Man man : list) {
				if (!used[man.index]) {
					used[man.index] = true;
					if (queryWoman.equals(woman.name))
						manName = man.name;
					break;
				}
			}
			if (manName != null)
				break;
		}
		return manName;
	}

}
