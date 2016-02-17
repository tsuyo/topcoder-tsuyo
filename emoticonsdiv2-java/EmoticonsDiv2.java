public class EmoticonsDiv2 {

	public int printSmiles(int smiles) {
		if (smiles == 1)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < smiles; i++) {
			if (smiles % i != 0)
				continue;
			min = Math.min(min, printSmiles(i) + smiles / i);
		}
		return min;
	}

}
