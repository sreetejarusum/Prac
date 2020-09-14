package hashmaps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumNumber {
	
	public static int getMaximumNumber(int [] arr) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (Integer in:arr) {
			
			if(!hm.containsKey(in)) {
				hm.put(in, 1);
			}else {
				hm.put(in, hm.get(in)+1);
			}
		}
		
		
		Set<Entry<Integer,Integer>> entry=hm.entrySet();
		for(Entry<Integer, Integer> i:entry) {
			if(i.getValue()>arr.length/2) {
				return i.getKey();
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
//		int [] arr= {2,2,1,3,3,2,3,2};
//		int [] arr= {2,2,1,3,3,2,3,2,3,2,2};
//		int [] arr= {2};
		int [] arr= {1,1,2};
		System.out.println(getMaximumNumber(arr));
		
		
	}

}
