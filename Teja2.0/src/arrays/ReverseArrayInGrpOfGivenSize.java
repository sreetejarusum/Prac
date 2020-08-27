package arrays;

public class ReverseArrayInGrpOfGivenSize {

	public static int[] revInGivenSize(int[] nums, int size) {

		for (int i = 0; i < nums.length; i = i + size) {

			int start = i;
			int end = Math.min(start + size - 1, nums.length - 1);

			while (start < end) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}

		}

		return nums;

	}

	public static void main(String[] args) {

		int size = 6;
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] res = revInGivenSize(nums, size);

		for (Integer in : res) {
			System.out.print(in + " ");
		}

	}

}
