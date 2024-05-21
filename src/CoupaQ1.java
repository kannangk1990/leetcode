public class CoupaQ1 {

	public static void main(String[] args) {
		String str="aaabbccdd";
		System.out.println(findCountOfString(str));
	}
	
	public static String findCountOfString(String str)
	{
		
		char[] chArr = str.toCharArray();
		int val=1;
		char temp=str.charAt(0);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<chArr.length-1;i++)
		{
			temp=str.charAt(i);
			if(temp==str.charAt(i+1))
				val++;
			else
			{
				sb.append(temp+""+val);
				val=1;
			}
		}
		sb.append(temp+""+val);
		return sb.toString();
	}

}
