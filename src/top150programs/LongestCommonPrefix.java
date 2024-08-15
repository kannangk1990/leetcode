package top150programs;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		System.out.println(findLongestCommonPrefix(str));

	}
	
	public static String findLongestCommonPrefix(String[] str)
	{
		StringBuilder sb = new StringBuilder();
		Arrays.sort(str);
		
		String first = str[0];
		String last = str[str.length-1];
		int length = Math.min(first.length(), last.length());
		for(int i=0;i<length;i++)
		{
			if(first.charAt(i)!=last.charAt(i))
				return sb.toString();
			sb.append(first.charAt(i));
		}
		
		
		return sb.toString();
	}

}
