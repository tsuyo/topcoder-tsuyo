import static java.util.Arrays.*;

public class CCipher {

	public String decode(String cipherText, int shift) {
		char[] ch = cipherText.toCharArray();
		char[] plain = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int idx = ch[i] - 'A' - shift;
			if (idx < 0)
				idx += 26;
			plain[i] = (char) ('A' + idx);
		}
		return new String(plain);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
