package week3.assignments3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set b) Make sure the set is in the ascending
	 * order c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */

	public static void main(String[] args) {

		int[] data = { 3, 2, 10, 4, 6, 7, 2, 3, 3, 6, 7, 1, 5, 8 };

		Set<Integer> setData = new TreeSet<Integer>();
		for (int integer : data) {
			setData.add(integer);
		}

		List<Integer> listData = new ArrayList<Integer>(setData);
		System.out.println(listData);
		for (int i = 0; i < listData.size(); i++) {
			if ((i + 1) != listData.get(i)) {
				System.out.println("Missing Number is : " + (i + 1));
				break;
			}
		}
	}
}
