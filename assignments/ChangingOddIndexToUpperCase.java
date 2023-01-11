package week1.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ChangingOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			System.out.print(charArray[i]);
		}

	}
}
