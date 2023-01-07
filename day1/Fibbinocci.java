package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {

		// Fibbinocci Series

		int n1 = 0;
		int n2 = 1;
		int sum;

		System.out.println(n1 + " \n" + n2);
		for (int i = 1; i <= 11; i++) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;

		}

	}
}
