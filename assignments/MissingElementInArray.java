package week1.assignments;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);
		int sum1 = 0;

		for (int i = 1; i <= 8; i++) {
			sum1 = sum1 + i;
		}
//		System.out.println(sum1);

		int sum2 = 0;
		for (int j = 0; j < arr.length; j++) {
			sum2 = sum2 + arr[j];

		}
//		System.out.println(sum2);
		System.out.println("Missing Element In Array is: " + (sum1 - sum2));
	}
}
