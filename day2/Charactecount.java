package week1.day2;

public class Charactecount {

	public static void main(String[] args) {
		String name = "TestLeaf";
		char expected = 'e';
		int count = 0;
		char[] charArray = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			if (charArray[i] == expected)
				count++;
		}
		System.out.println(count);

	}
}
