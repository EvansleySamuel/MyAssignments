package dailychallenges;

public class FIndElementThatAppearOnlyOnceInArray {

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };

		int uniqueNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			uniqueNum = uniqueNum ^ nums[i];
		}
		System.out.println("Unique Number is " + uniqueNum);
	}
}
