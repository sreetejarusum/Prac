package gfg.bitwiseoperations.copy;

/*
 * Java program to find two odd occurring numbers in an array
 * 
 * eg:{3,3,4,4,4,2,1,1,1,1,5,5}
 * o/p:4,2
 * Algo
 * 1)Find xor of all array elements
 * 
 * 2)find Sn->Rightmost set bit
 *	Sn=xor&~(xor-1)
 *
 * 3)Segregate array elements into two groups by doing  "arr[i] & Sn "
 * 	-Group1: Here the elements having set bit @Sn
 * 	-Group2: Here the elements does'nt have set bit @Sn
 * 
 * 4)Finally print Goup1 and Grop2 Numbers
 */
public class Find2OddOccuringNumbersInArray {

	public static void OddOccuringNumbers(int arr[]) {

		if (arr.length < 2) {
			System.out.println("Array should have atleast 2 elements");
		}

		int res = 0;
		int res1 = 0;
		int res2 = 0;

		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}

		int Sn = res & (~(res - 1));

		for (int i = 0; i < arr.length; i++) {
			if ((Sn & arr[i]) != 0) {
				res1 = res1 ^ arr[i];
			} else {
				res2 = res2 ^ arr[i];
			}
		}

		System.out.println(res1 + " " + res2);
	}

	public static void main(String[] args) {

		int[] nums = { 3, 3, 4, 4, 4, 2, 1, 1, 1, 1, 5, 5 };
		OddOccuringNumbers(nums);

	}

}
