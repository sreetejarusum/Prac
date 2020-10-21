package gfg.bitwiseoperations.copy;

/*
 * Java Program to find single odd occurrence number in an array of size n
 * 
 * eg:{3,3,3,3,4,4,5,5,5,2,2,1,1}
 * o/p:5
 */



public class OddOccuranceNumberInArray {
	
	public static int getOddOccurance(int [] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res^arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int [] nums={3,3,3,3,4,4,5,5,5,2,2,1,1};
		System.out.println(getOddOccurance(nums));
	}
	
}
