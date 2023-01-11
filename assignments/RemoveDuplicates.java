package week1.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week 1";
		String[] splitvalue = text.split(" ");
		for (int i = 0; i < splitvalue.length; i++) {
			for (int j = i + 1; j < splitvalue.length; j++) {
				if (splitvalue[i].equals(splitvalue[j])) {
					splitvalue[j] = " ";
				}
			}
		}
		for (int j = 0; j < splitvalue.length; j++) {
			if (splitvalue[j] != " ") {
				System.out.print(splitvalue[j] + " ");
			}
		}

	}
}
