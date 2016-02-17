public class UserName {

	public String newMember(String[] existingNames, String newName) {
		boolean[] index = new boolean[existingNames.length + 1];
		for (String en : existingNames) {
			if (newName.equals(en)) {
				index[0] = true;
			} else if (en.startsWith(newName)) {
				int num;
				try {
					num = Integer.parseInt(en.substring(newName.length(),
							en.length()));
				} catch (NumberFormatException e) {
					continue;
				}
				if (num < index.length)
					index[num] = true;
			}
		}
		for (int i = 0; i < index.length; i++) {
			if (!index[i]) {
				return (i == 0) ? newName : (newName + i);
			}
		}
		return null; // dummy
	}

}
