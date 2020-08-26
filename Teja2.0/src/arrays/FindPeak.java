package arrays;

public class FindPeak {
	
	public static int getPeak(int [] nums) {
		
		int start=0;
		int end=nums.length-1;
		
		while(start<end) {
			int mid=start+(end-start)/2;
			
			if(nums[mid]<nums[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
			
		}
		return start;
	}
	
	public static void main(String[] args) {
		
		int [] nums= {1,2,1,3,2};
		System.out.println(getPeak(nums));
		
		/*
		 * start=0,1
		 * end=3
		 * mid=1,2
		 */
	}

}
