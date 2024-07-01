
public class LargestPalindrome {

	public static void main(String[] args) {
		int[] nums = {1,232,55454545,9090490,161};
		System.out.println(BiggestPalindrome(nums));

	}
	
	public static String BiggestPalindrome(int[] nums)
	{
		int firstBig=Integer.MIN_VALUE;
		int secongBig=Integer.MIN_VALUE;
		boolean oddCounter=false;
		
		for(int num:nums)
		{
			if(num>firstBig)
			{
				if(isPalindrome(num))
				{
					secongBig=firstBig;
					firstBig=num;
				}
			}
			
			else if((num>secongBig)&&(num<firstBig))
			{
				if(isPalindrome(num))
				{
					secongBig=num;
				}
			}
		}
		
		
		return Integer.toString(firstBig);
	}
	
	public static boolean isPalindrome(int num)
	{
		String number = Integer.toString(num);
		
		int[] intCount = new int[128];
		
		boolean oddCount=false;
		
		for(char ch:number.toCharArray())
		{
			intCount[ch]++;
		}
		
		for(int count:intCount)
		{
			if(count%2==1)
				oddCount=true;	
		}
		
		if(number.length()%2==0)
		{
			if(oddCount)
				return false;
		}
		
		else
		{
			if(!oddCount)
				return false;
		}
		
		return true;
	}

}
