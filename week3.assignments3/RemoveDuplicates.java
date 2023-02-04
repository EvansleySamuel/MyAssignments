package week3.assignments3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "PayPal India";
		text = text.toLowerCase();
		char[] charArray = text.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (Character character : charArray) {
			if (character != ' ') {
				if (!charSet.add(character)) {
					dupCharSet.add(character);
				}
			}
		}

		// System.out.println(charSet);
		// System.out.println(dupCharSet);

		charSet.removeAll(dupCharSet);
		System.out.println("Unique characters : " + charSet);
	}
}
