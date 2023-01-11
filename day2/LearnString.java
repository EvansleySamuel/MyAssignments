package week1.day2;

import java.lang.reflect.Array;

public class LearnString {

	public static void main(String[] args) {

		String name = "HCL technologies";

		// convert String to char
		char[] charAt = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			System.out.println(charAt[i]);
		}

		// To get number of chars
		System.out.println(name.length());

		// To check if sequence of character is present in string
		boolean contains = name.contains("CL");
		System.out.println(contains);

		// convert to upper or lower case
		if (name.contains("Hcl") || name.contains("HCL")) {
			System.out.println("HCL is present");
		}

		// Get a partial String
		CharSequence subSequence = name.substring(4);
		System.out.println(subSequence);

		// get the index if char
		int indexOf = name.indexOf('C');
		System.out.println(indexOf);

		// Remove the space in the front and end
		String trimSpace = name.trim();
		System.out.println(trimSpace);

	}

}
