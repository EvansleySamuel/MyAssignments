package week3.assignments3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	/*
	 * Pseudo Code: 
	 * a) Create a empty Set Using TreeSet
	 * b) Declare for loop iterator from 0 to data.length and add into Set 
	 * c) converted Set into List
	 * d) Print the second last element from List
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> nums = new TreeSet<Integer>();

		for (Integer i : data) {
			nums.add(i);

		}
		List<Integer> datas = new ArrayList<Integer>(nums); // converting set to list
		int size = datas.size();

		System.out.println("Second Largest: " + datas.get(size - 2));
	}
}
