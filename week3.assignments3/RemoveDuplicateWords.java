package week3.assignments3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> setText = new LinkedHashSet<String>();
		for (String word : split) {
			setText.add(word);
		}

		List<String> listText = new ArrayList<String>(setText);

		String duplicateRemovedText = "";

		for (int i = 0; i < listText.size(); i++) {
			if (i == listText.size() - 1) {
				duplicateRemovedText = duplicateRemovedText + listText.get(i);
			} else {
				duplicateRemovedText = duplicateRemovedText + listText.get(i) + " ";
			}

		}

		System.out.println(duplicateRemovedText);
	}

}
