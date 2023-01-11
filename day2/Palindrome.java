package week1.day2;

import java.lang.reflect.Array;

public class Palindrome {

	// Even after reversing, If i get same sting means its Palindrome
	public static void main(String[] args) {
		String name = "MADAM";
		String rev = "";

		char[] charArray = name.toCharArray();

		for (int i = name.length() - 1; i > 0; i--) {
			rev = rev + charArray[i];
		}
		if (name.equals(charArray)) {
			System.out.println("Its palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}
