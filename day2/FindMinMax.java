package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {

		int[] values = { 12, 13, 14, 15, 16, 17 };
		int length = values.length;
		Arrays.sort(values);

		System.out.println("Min: " + values[1]);
		System.out.println("Max: " + values[length - 1]);

	}

}
