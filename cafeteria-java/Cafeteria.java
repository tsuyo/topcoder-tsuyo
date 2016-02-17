import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Cafeteria {
	int CLOSE = 14 * 60 + 30;

	public String latestTime(int[] offset, int[] walkingTime, int[] drivingTime) {
		int N = offset.length;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int time = CLOSE - drivingTime[i];
			int adjust = (time % 10 - offset[i] + 10) % 10;
			time -= adjust;
			max = max(max, time - walkingTime[i]);
		}
		return conv(max);
	}

	String conv(int min) {
		int h = min / 60;
		int m = min % 60;
		if (h >= 13) {
			h -= 12;
		}
		return String.format("%02d:%02d", h, m);
	}

}
