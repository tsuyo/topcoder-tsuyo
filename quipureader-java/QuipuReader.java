import static java.util.Arrays.*;

public class QuipuReader {

	public int[] readKnots(String[] knots) {
		long[] kbits = new long[knots.length];
		for (int i = 0; i < knots.length; i++) {
			char[] ch = knots[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				kbits[i] <<= 1;
				if (ch[j] == 'X') {
					kbits[i] |= 1;
				}
			}
		}
		int[] ret = new int[knots.length];
		int scale = 1;

		for (int cl = 0; cl < 7; cl++) {
			long all = findMask(kbits);
			for (int i = 0; i < ret.length; i++) {
				if (kbits[i] != 0) {
					int num = conv(all, kbits[i]);
					if (num != 0) {
						ret[i] += scale * num;
						kbits[i] -= lbits(kbits[i]);
					}
				}
			}
			scale *= 10;
		}
		return ret;
	}

	long findMask(long[] kbits) {
		long mask = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < kbits.length; i++) {
			if (kbits[i] == 0)
				continue;
			int cur = Long.numberOfTrailingZeros(kbits[i]);
			if (min > cur) {
				min = cur;
				mask = lbits(kbits[i]);
			} else if (min == cur) {
				mask |= lbits(kbits[i]);
			}
		}
		return mask;
	}

	long lbits(long org) {
		int shift = Long.numberOfTrailingZeros(org);
		long ret = org >> shift;
		ret -= ret & (ret + 1);
		return (ret << shift);
	}

	int conv(long all, long val) {
		return Long.bitCount(all & val);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
