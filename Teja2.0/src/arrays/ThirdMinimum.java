package arrays;

/*
 * Java Program to find the Third_Minimum  elements in the input array.
 *
 */
public class ThirdMinimum {
	
	public static int thirdMinimum(int [] nums) {
		
		Integer minimum=Integer.MAX_VALUE;
		Integer secondMinimum=Integer.MAX_VALUE;
		Integer thirdMinimum=Integer.MAX_VALUE;
		
		
		for(Integer in:nums) {
			
			if(in==minimum||in==secondMinimum||in==thirdMinimum) {
				continue;
			}
			
			if(in < minimum) {
				thirdMinimum=secondMinimum;
				secondMinimum=minimum;
				minimum=in;
			}
			
			if(in > minimum && in < secondMinimum) {
				thirdMinimum=secondMinimum;
				secondMinimum=in;
			}
				
			if(in > secondMinimum && in < thirdMinimum) {
				thirdMinimum=in;
			}
			
		}
		
		return thirdMinimum;
	}
	
	public static void main(String[] args) {
		int [] nums= {1,3,2,-5,-7};
		System.out.println(thirdMinimum(nums));
	}

}
