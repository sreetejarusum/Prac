package sets;

import java.util.HashSet;

public class IsDuplicatesPresent {
	
	public static boolean isDuplicates(int [] arr) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!hs.contains(arr[i])) {
				hs.add(arr[i]);
			}else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4};
		System.out.println(isDuplicates(arr));
	}

	

}
