import java.util.Arrays;

public class TallPeople {

	public int[] getPeople(String[] people) {
		int R = people.length;
		int C = people[0].split(" ").length;
		int[][] len = new int[R][C];
		for (int r = 0; r < R; r++) {
			String[] strcols = people[r].split(" ");
			for (int c = 0; c < C; c++) {
				len[r][c] = Integer.parseInt(strcols[c]);
			}
		}

		// 1st
		int[] shortest = new int[R];
		Arrays.fill(shortest, 2000);
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				shortest[r] = Math.min(shortest[r], len[r][c]);
			}
		}
		int max = 0;
		for (int r = 0; r < R; r++) {
			max = Math.max(max, shortest[r]);
		}

		// 2nd
		int[] tallest = new int[C];
		for (int c = 0; c < C; c++) {
			for (int r = 0; r < R; r++) {
				tallest[c] = Math.max(tallest[c], len[r][c]);
			}
		}
		int min = 2000;
		for (int c = 0; c < C; c++) {
			min = Math.min(min, tallest[c]);
		}
		return new int[] { max, min };
	}
}
