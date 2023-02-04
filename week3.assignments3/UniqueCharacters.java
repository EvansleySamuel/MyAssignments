package week3.assignments3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String name = "Evansleey";
		char[] charArray = name.toCharArray();
		Set<Character> Cha = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j <= charArray.length; j++) {
				if (i != j) {

					Cha.add(charArray[i]);
				}
			}

		}
		System.out.println("Unique Characters:" + Cha);

	}
}
