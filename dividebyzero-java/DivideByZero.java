import java.util.*;

public class DivideByZero {

	public int CountNumbers(int[] numbers) {
		TreeSet<Integer> all = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			all.add(numbers[i]);
		}

		int prev = all.size();
		int post = -1;

		while (prev != post) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i : all) {
				list.add(i);
			}
			Collections.sort(list);

			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					int div = list.get(j) / list.get(i);
					all.add(div);
				}
			}
			prev = list.size();
			post = all.size();
		}
		return prev;
	}

	void debug(Object... obj) {
		System.err.println(Arrays.deepToString(obj));
	}

}
