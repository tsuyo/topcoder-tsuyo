public class NotTwo {

	public int maxStones(int width, int height) {
		int S = 0;
		for (int h = 0; h < height; h++) {
			int hh = h % 4;
			for (int w = 0; w < width; w++) {
				int wh = w % 4;
				if (hh <= 1) {
					if (wh <= 1) {
						S++;
					}
				} else {
					if (wh >= 2) {
						S++;
					}
				}
			}
		}
		return S;
	}

}
