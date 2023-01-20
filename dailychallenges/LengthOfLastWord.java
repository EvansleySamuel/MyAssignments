package dailychallenges;

public class LengthOfLastWord {

	public static void main(String[] args) {

		int len = 0;
		String name = "  Hello World ";
		String value = name.trim();
		char[] charArray = value.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			if (charArray[i] == ' ') {
				break;
			} else {
				len++;

			}
		}
		System.out.println("Length of the last word is: " + len);

	}
}
