package strings;

public class LongestCommonPrefix {
	
	public static String findLongestCommonPrefix(String[] strings) {
		
		if(strings==null || strings.length==0) {
			return "";
		}
		
		String longestCommonPrefix =strings[0];
		for(int i=1;i<strings.length;i++) {
			while(strings[i].indexOf(longestCommonPrefix)!=0) {
				longestCommonPrefix=longestCommonPrefix.substring(0,longestCommonPrefix.length()-1);
			}
		}
		return longestCommonPrefix;
	}
	
	public static void main(String[] args) {
//		String [] input= {"Flower","Flow","Float"};
		String [] input= {"Car","Cat","Cow"};
		System.out.println(findLongestCommonPrefix(input));
	
	}

}
