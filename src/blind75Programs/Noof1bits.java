package blind75Programs;

public class Noof1bits {

	public static void main(String[] args) {
		System.out.println(noof1bitsBitManipulation(11));
		System.out.println(noof1bitsBitString(15));

	}
	
	public static int noof1bitsBitString(int n)
	{
		int count=0;
		
		String bitString = Integer.toBinaryString(n);
		
		for(char ch:bitString.toCharArray())
		{
			if(ch == '1')
				count++;
		}
		
		return count;
	}

	
	public static int noof1bitsBitManipulation(int n)
	{
		int count=0;
		
		while(n!=0)
		{
			count += (n&1);
			n >>>= 1;
		}
		
		return count;
	}

}
