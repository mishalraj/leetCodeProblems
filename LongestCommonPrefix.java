package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };

		System.out.println(longestCommon(str));
	}

	private static String longestCommon(String[] str) {
		StringBuffer res = new StringBuffer("");
		if (str.length == 0 || str == null)
			return res.toString();
		int index = 0;
		for (char c : str[0].toCharArray()) {
			for (int i = 1; i < str.length; i++) {
				if (index >= str[i].length() || c != str[i].charAt(index)) {
					return res.toString();
				}
			}
			res.append(c);
			index++;
		}
		return res.toString();
	}

}
