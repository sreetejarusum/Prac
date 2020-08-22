package hashmaps;

import java.util.HashMap;

public class FirstUniqueCharInStr {
	
	/*Java Program to identify first unique char in String,
	 * if there are no unique chars then return -1 
	 */
	public static char getFirstUniqueCharInStr(String str) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),i);
			}else {
				hm.put(str.charAt(i),-1);
			}
		}
		
		char first = 0;
		int min=Integer.MAX_VALUE;
		for(Character c:hm.keySet()) {
			if(hm.get(c)>-1 && hm.get(c)<min) {
				min=hm.get(c);
				first=c;
			}
		}
		return (char) (first==Integer.MAX_VALUE?-1:first);
//		return min==Integer.MAX_VALUE?-1:min;
	}
	
	public static void main(String[] args) {
		System.out.println(getFirstUniqueCharInStr("Hello"));
		
	}

}
