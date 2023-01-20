package dailychallenges;

public class IsPalindrome {

	public static void main(String[] args) {
		String name = "A man, a plan, a canal: Panama";

		String lowerName = name.toLowerCase(); // change all letters to lower case
		String noSpecialName = lowerName.replaceAll("[^a-zA-Z0-9]", ""); // Remove all symbols

		char[] charArray = noSpecialName.toCharArray();
		String reversefinalString = ""; // Initiate a empty string

		// Iterate from right to left and check weather it equals to given string

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversefinalString = reversefinalString + charArray[i];
		}
		if (reversefinalString.equals(noSpecialName)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("Its not a Palindrome");
		}

	}
}
