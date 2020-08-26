package arrays;

public class MoveZerosToEnd {
	
	public static int[] moveZerosToEnd(int [] nums) {
		int i=0;
		for(int j=0;j<nums.length;j++) {
			
			if(nums[j]!=0) {
				nums[i++]=nums[j];
			}
		}
		
		while(i<nums.length) {
			nums[i++]=0;
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		int [] arr={0,4,5,0,3,0,-1};//4,5,3,-1,0,0,0
		moveZerosToEnd(arr);
		
		for(Integer in:arr) {
			System.out.print(in+" ");
		}
	}

}
