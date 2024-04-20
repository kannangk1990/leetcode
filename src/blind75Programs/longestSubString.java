package blind75Programs;

import java.util.HashMap;
import java.util.Map;

public class longestSubString {

	public static void main(String[] args) {
		String str1="drdo";
		String str2="abcabcbb";
		String str3="bbbbb";
		System.out.println(longestSubStringfn(str1));
		System.out.println(longestSubStringfn(str2));
		System.out.println(longestSubStringfn(str3));

	}
	
	public static int longestSubStringfn(String str)
	{
		int longestSubString=0;
		int left=0;
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(int right=0;right<str.length();right++)
		{
			char ch = str.charAt(right);
			if(charMap.containsKey(ch) && right >= left)
			{
				left = charMap.get(ch)+1;
			}
			longestSubString = Math.max(right-left+1, longestSubString);
			charMap.put(ch, right);
		}
		
		
		
		return longestSubString;
	}

}
