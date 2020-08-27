package strings;

public class SubSequenceOfString {
	
	public static boolean isSubSequence(String s,String t) {
		
		if(s.equals("")) {
			return true;
		}
		
		int index=0;
		for(int i=0;i<t.length();i++){
			
			if(t.charAt(i)==s.charAt(index)) {
				index++;
			}
			
			if(index>=s.length()) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String t="abcde";
		String s="axe";
		System.out.println(isSubSequence(s,t));
		
	}

}
