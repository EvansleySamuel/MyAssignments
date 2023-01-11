package week1.day2;

import java.util.Iterator;

public class LearnArrays {

	public static void main(String[] args) {

		// Arrays

		// To print all the items inside array

		// Length is a property in Arrays
		int[] marks = { 91, 92, 93, 95, 99 };

		for (int i = 0; i < marks.length; i++)

			System.out.println(marks[i]);

		String[] subjects = { "English", "Tamil", "Science", "Maths", "Social Science" };

		System.out.println(subjects.length); // Length

		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i]);
		}

		// Integer
		int subs[] = new int[2];
		System.out.println(subs[1]);

		// String
		String Str[] = new String[2];
		System.out.println(Str[1]);
	}

}
