package week1.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";

		int sum = 0;

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);

			if (Character.isDigit(character)) {
				sum = sum + Character.getNumericValue(character);
			}

		}
		System.out.print(sum);

	}
}
