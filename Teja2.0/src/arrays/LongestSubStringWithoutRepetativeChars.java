package arrays;

import java.util.HashSet;

public class LongestSubStringWithoutRepetativeChars {

	public static int longestSubStrWithOutNonReptChars(String str) {

		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;

		HashSet<Character> hs = new HashSet();

		while (b_pointer < str.length()) {

			if (!hs.contains(str.charAt(b_pointer))) {
				hs.add(str.charAt(b_pointer));
				b_pointer++;
				max = Math.max(hs.size(), max);
			} else {
				hs.remove(str.charAt(a_pointer));
				a_pointer++;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		String str = "abcabc";
		System.out.println(longestSubStrWithOutNonReptChars(str));

	}

}
