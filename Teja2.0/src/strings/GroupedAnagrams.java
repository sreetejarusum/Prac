package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Java programs to group Anagrams 
 */

public class GroupedAnagrams {
	
	public static List<List<String>> groupAnagrams(String [] strs){
		List<List<String>> groupedAnagrams=new ArrayList();
		HashMap<String,List<String>> hm=new HashMap<String,List<String>>();
		
		for(String str:strs) {
			char[] characters=str.toCharArray();
			Arrays.sort(characters);
			String sorted=new String(characters);
			
			if(!hm.containsKey(sorted)) {
				hm.put(sorted, new ArrayList<String>());
			}
			
			hm.get(sorted).add(str);
		}
		
		groupedAnagrams.addAll(hm.values());
		return groupedAnagrams;
	}
	
	
	public static void main(String[] args) {
		
		String[] strs= {"eat","tan","tea","ant","nat","unique"};
		List<List<String>> result=groupAnagrams(strs);
		
		for(List lst:result) {
			System.out.println(lst);
		}
	}

}
