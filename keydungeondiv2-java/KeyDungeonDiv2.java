public class KeyDungeonDiv2 {

	public int countDoors(int[] doorR, int[] doorG, int[] keys) {
		int len = doorR.length;
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			int rng = keys[0] - doorR[i];
			int gng = keys[1] - doorG[i];
			if (rng >= 0 && gng >= 0) {
				cnt++;
				continue;
			}
			int tmp = keys[2];
			if (rng < 0) {
				tmp += rng;
			}
			if (gng < 0) {
				tmp += gng;
			}
			System.out.println(keys[2]);
			if (tmp >= 0)
				cnt++;
		}
		return cnt;
	}

}
