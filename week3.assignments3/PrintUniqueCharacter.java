package week3.assignments3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "Evansley Samuel";
		name = name.toLowerCase();
		Set<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < name.length(); i++) {
			charSet.add(name.charAt(i));
		}

		String uniqueChars = "";
		List<Character> charList = new ArrayList<Character>(charSet);

		for (int i = 0; i < charList.size(); i++) {
			if (charList.get(i) != ' ') {
				if (i == charList.size() - 1) {
					uniqueChars = uniqueChars + charList.get(i);
				} else {
					uniqueChars = uniqueChars + charList.get(i) + " ";
				}
			}
		}
		System.out.println(uniqueChars);

	}
}