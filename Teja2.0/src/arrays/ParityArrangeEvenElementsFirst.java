package arrays;

/*
 * This program first places even numbers and then odd number.
 */

public class ParityArrangeEvenElementsFirst {
	
	public static int[] parityArranger(int[] nums) {
		int i=0;   
		for(int j=0;j<nums.length;j++) {    
			if(nums[j]%2==0) {
				int tmp=nums[i];
				nums[i++]=nums[j];
				nums[j]=tmp;
			}
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
	
		int [] nums= {3,5,2,0,2,3,5,8}; 
		int [] res=parityArranger(nums);
		for(Integer in:res) {
			System.out.print(in +" ");
		}
	
	}

}
