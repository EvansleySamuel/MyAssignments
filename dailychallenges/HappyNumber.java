package dailychallenges;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 17;
		int noOfDigit = (int) Math.floor(Math.log10(n) + 1);

		while (noOfDigit > 1) {
			int sumSquare = 0;
			while (n != 0) {
				int rem = n % 10;
				sumSquare += (rem * rem);
				n = n / 10;
			}
			n = sumSquare;
			noOfDigit = (int) Math.floor(Math.log10(sumSquare) + 1);
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}

	}
}
