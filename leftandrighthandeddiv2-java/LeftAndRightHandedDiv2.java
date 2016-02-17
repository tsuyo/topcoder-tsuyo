public class LeftAndRightHandedDiv2 {

	public int count(String S) {
		char[] chs = S.toCharArray();
		int cnt = 0;
		for (int i = 0; i < chs.length - 1; i++) {
			if (chs[i] == 'R' && chs[i + 1] == 'L')
				cnt++;
		}
		return cnt;
	}

}
