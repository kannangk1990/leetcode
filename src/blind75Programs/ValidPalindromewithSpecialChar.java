package blind75Programs;

public class ValidPalindromewithSpecialChar {

	public static void main(String[] args) {
		String str="A man, a plan, a canal: Panama";
		System.out.println(isValidPalindromewithSpecialChar(str));

	}
	
	public static boolean isValidPalindromewithSpecialChar(String str)
	{
		int first = 0;
		int last = str.length()-1;
		
		char currFirst;
		char currLast;
		
		while(first<=last)
		{
			currFirst=str.charAt(first);
			currLast=str.charAt(last);
			
			if(!Character.isLetterOrDigit(currFirst))
			{
				first++;
			}
			else if(!Character.isLetterOrDigit(currLast))
			{
				last--;
			}
			else
			{
				if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast))
				{
					return false;
				}
				first++;
				last--;
			}
		}
		
		return true;
	}

}
