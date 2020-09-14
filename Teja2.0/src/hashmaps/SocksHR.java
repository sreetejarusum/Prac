package hashmaps;

import java.util.HashMap;

/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class SocksHR {
	
	static int sockMerchant(int n, int[] ar) {

	    HashMap<Integer,Integer> hashmap=new HashMap();
	    	for(int i=0;i<ar.length;i++){
	    		if(!hashmap.containsKey(ar[i])){
	    			hashmap.put(ar[i],1);
	    			}else{
	    			hashmap.put(ar[i],hashmap.get(ar[i])+1);
	      }
	  }

	  int count=0;

	  for(Integer in : hashmap.values()){

		  if(in>=2) {
			  count=count+in/2;
		  }
	  }
	  

	  return count;

	}


	public static void main(String[] args) {
		
		int[] ar= {10,20,20,10,10,30,50,10,20};
		int n=9;
		System.out.println(sockMerchant(n,ar));
	}
}
