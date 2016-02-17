import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Country implements Comparable<Country> {
	String name;
	int[] medal = new int[3];

	public Country(String n) {
		this.name = n;
	}

	public int compareTo(Country o) {
		for (int i = 0; i < 3; i++) {
			if (medal[i] != o.medal[i])
				return o.medal[i] - medal[i];
		}
		return name.compareTo(o.name);
	}

	// @Override
	// public boolean equals(Object obj) {
	// return name.equals(((Country) obj).name);
	// }

	@Override
	public String toString() {
		return name + " " + medal[0] + " " + medal[1] + " " + medal[2];
	}
}

public class MedalTable {

	public String[] generate(String[] results) {
		Map<String, Country> map = new TreeMap<String, Country>();
		for (String res : results) {
			String[] cols = res.split(" ");
			for (int i = 0; i < cols.length; i++) {
				String c = cols[i];
				if (!map.containsKey(c))
					map.put(c, new Country(c));
				Country country = map.get(c);
				country.medal[i] += 1;
			}
		}
		Country[] cobj = new Country[map.size()];
		int i = 0;
		for (Country c : map.values()) {
			cobj[i++] = c;
		}
		Arrays.sort(cobj);
		String[] ret = new String[cobj.length];
		for (int j = 0; j < ret.length; j++) {
			ret[j] = cobj[j].toString();
		}
		return ret;
	}

	// void debug(Object... os) {
	// System.err.println(Arrays.deepToString(os));
	// }
}
