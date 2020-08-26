package arrays;

import java.util.Arrays;

public class TripetsWithGivenSum {

	public static void getTripletsForGivenSum(int[] nums, int sum) {

		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {

			int j = i+1;
			int k = nums.length - 1;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] == sum) {
					System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
					j++;
					k--;
				} else if (nums[i] + nums[j] + nums[k] > sum) {
					k--;
				} else {
					j++;
				}
			}

		}

	}

	public static void main(String[] args) {

		int[] nums = { 2, 3, -1, 2, 0, 3, -3, 5, 9 };
		int sum = 5;
		getTripletsForGivenSum(nums, sum);
	}

}
