
package week3.assignments3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingcollection {

	public static void main(String[] args) {
		String[] companies = { "HCL", " Wipro ", "  Aspire Systems", "CTS " };

		List<String> companiesList = new ArrayList<String>();

		for (String string : companies) {
			companiesList.add(string.trim());
		}

		Collections.sort(companiesList);
		System.out.println(companiesList);

		List<String> descOrderCompaniesList = new ArrayList<String>();

		for (int i = companiesList.size() - 1; i >= 0; i--) {
			descOrderCompaniesList.add(companiesList.get(i));
		}
		System.out.println(descOrderCompaniesList);

	}

}
