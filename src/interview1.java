
public class interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aaabbccaaa
		//a3b2c2a3
		String str ="aaabbccaaa";
		char ch=str.charAt(0);
		int count=0;
		for (int i=0,j=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.print(ch+""+(i-j));
				j=i;
				ch=str.charAt(i);
			}
			
			else if(i==str.length()-1)
			{
				System.out.print(ch+""+(i-j+1));
			}
		}

	}

}
