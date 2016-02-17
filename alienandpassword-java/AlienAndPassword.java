public class AlienAndPassword {

	public int getNumber(String S) {
		char[] ch = S.toCharArray();
		int cnt = 0;
		char pre = '*';
		for (int i = 0; i < ch.length; i++) {
			if (pre != ch[i]) {
				cnt++;
				pre = ch[i];
			}
		}
		return cnt;
	}

}
