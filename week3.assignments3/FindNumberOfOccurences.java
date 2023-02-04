package week3.assignments3;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurences {
	public static void main(String[] args) {
		int[] inputArray = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> inputMap = new TreeMap<Integer, Integer>();

		for (int element : inputArray) {
			if (inputMap.containsKey(element)) {
				int existingValue = inputMap.get(element);
				inputMap.put(element, existingValue + 1);
			} else {
				inputMap.put(element, 1);
			}
		}
		System.out.println(inputMap);

	}

}