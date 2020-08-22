package hashmaps;

import java.util.HashMap;


public class SingleNumber {
	
	/*
	 * This methods is implemented using HASH MAP,  
	 * This Solution works even if other elements repeated more than once
	 */
	public static int findSingleNumberHashMap(int [] nums) {
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Integer in:nums) {
			if(!hm.containsKey(in)) {
				hm.put(in,1);
			}else {
				hm.put(in,hm.get(in)+1);
			}
		}
		for(Integer i:hm.keySet()) {
			if(hm.get(i)==1) {
				
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		
		int [] nums= {4,1,2,1,2};
		System.out.println(findSingleNumberHashMap(nums));
		
	}
}
