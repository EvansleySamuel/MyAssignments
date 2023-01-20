package dailychallenges;

public class SquareRootOfGivenNumber {

	public static void main(String[] args) {

		int x = 8;
		int sqroot = 0;
		for (int i = 1; i <= 8; i++) {
			sqroot = i * i;
			if (sqroot == x) {
				System.out.println(i);
				break;
			} else if (sqroot > x) {
				System.out.println(i - 1);
				break;
			}
		}
	}
}
