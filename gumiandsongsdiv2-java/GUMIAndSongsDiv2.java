import java.util.*;

public class GUMIAndSongsDiv2 {

	public int maxSongs(int[] duration, int[] tone, int T) {
		int n = duration.length;
		int ans = 0;
		for (int i = 0; i < (1 << n); i++) {
			boolean ng = false;
			int song = 0;
			int time = 0;
			int maxt = -1;
			int mint = 100001;
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
					song += 1;
					time += duration[j];
					maxt = Math.max(maxt, tone[j]);
					mint = Math.min(mint, tone[j]);
					if (time + maxt - mint > T) {
						ng = true;
						break;
					}
				}
			}
			if (!ng) {
				ans = Math.max(ans, song);
			}
		}
		return ans;
	}

}
