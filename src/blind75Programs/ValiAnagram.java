package blind75Programs;

public class ValiAnagram {

	public static void main(String[] args) {
		String s="anagram";
		String t="nagaram";
		System.out.println(isValidAnagram(s,t));

	}
	
	public static boolean isValidAnagram(String s,String t)
	{
		if(s.length()!=t.length())
			return false;
		
		int[] char_set = new int[128];
		
		for(char ch:s.toCharArray())
		{
			char_set[ch]++;
		}
		
		for(char ch:t.toCharArray())
		{
			--char_set[ch];
			
			if(char_set[ch]<0)
				return false;
		}
		
		return true;
	}

}
