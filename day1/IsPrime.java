package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		int num = 11;
		for (int i = 2; i < num; i++)
			if (num % i == 0) {
				System.out.println("Given number " + num + " is not a Prime Number");
				break;
			} else {
				System.out.println("Given number " + num + " is  a Prime Number");
				break;
			}

	}

}
