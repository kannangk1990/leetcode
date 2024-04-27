package blind75Programs;

public class ClaimbingStairs {

	public static void main(String[] args) {
		int n=10;
		System.out.println(claimbingStairs(n));

	}
	
	public static int claimbingStairs(int n)
	{
		int total=0;
		int num1=0;
		int num2=1;
		
		for(int i=0;i<n;i++)
		{
			total=num1+num2;
			num1=num2;
			num2=total;
		}
		
		return total;
	
	}
}
