package sets;

import java.util.HashSet;

public class FindPairs {
	
	public static void findPairs(int[] nums,int sum) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hs.contains(sum-nums[i])) {
				System.out.println("Pairs are : "+(sum-nums[i])+" & "+nums[i]);
			}else {
				hs.add(nums[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		int[] nums= {11,5,6};
//		int [] nums= {3,2,8,15,-8};   //sum=17  exp o/p = 2,15   
		int sum=17;
		findPairs(nums,sum);

	}

}
