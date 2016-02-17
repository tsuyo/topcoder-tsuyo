public class LongLongTripDiv2 {

	public String isAble(long D, int T, int B) {
		long bt = ((long) T) * B;
		if (bt < D) {
			return "Impossible";
		} else if (bt == D) {
			return "Possible";
		}
		long diff = bt - D;
		if (diff % (B - 1) == 0) {
			long times = diff / (B - 1);
			if (times <= ((long) T)) {
				return "Possible";
			} else {
				return "Impossible";
			}
		} else {
			return "Impossible";
		}
	}

}
