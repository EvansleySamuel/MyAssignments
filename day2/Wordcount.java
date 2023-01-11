package week1.day2;

public class Wordcount {

	public static void main(String[] args) {

		String str = "AMAZON DEVELOPMENT CENTRE";
		String[] split = str.split(" ");
		System.out.println(split.length);

		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}

	}
}
