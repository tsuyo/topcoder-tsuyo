import static java.util.Arrays.*;

public class PassingGrade {

	public int pointsNeeded(int[] pointsEarned, int[] pointsPossible,
			int finalExam) {
		int N = pointsEarned.length;
		int earned = 0;
		int possible = finalExam;
		for (int i = 0; i < N; i++) {
			earned += pointsEarned[i];
			possible += pointsPossible[i];
		}
		int req = (int) Math.ceil(Math.max(0, possible * 0.65 - earned));
		return (req > finalExam) ? -1 : req;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
