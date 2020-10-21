package gfg.bitwiseoperations.copy;

/*
 * Java Program to find the missing number in an array of size n,
 * provided all the numbers appears only once in different order one number is missing.
 * 
 * ex:{1,4,5,2} here  n=5 and missing number is 3
 * 
 *
 */

public class FindMissingNumberInArrayOfSizeN {

	public static int findMissingNumber(int[] arr, int n) {
		int arrxorres = 0;
		for (int i = 0; i < arr.length; i++) {
			arrxorres = arrxorres ^ arr[i];
		}
		int xorofnnum = 1;
		for (int i = 2; i <= n; i++) {
			xorofnnum = xorofnnum ^ i;
		}
		return arrxorres ^ xorofnnum;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 3, 5, 2 };
		int n = 5;
		System.out.println(findMissingNumber(nums, n));

	}

}
