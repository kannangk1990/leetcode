package blind75Programs;

public class SumofTwoIntegers {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println(intSum(a,b));
		System.out.println(intSub(a,b));

	}
	
	/*
	 * & (and) operator actually finds the position of carry or borrow in bit
	 * position ^ (xor) operator actually performs addition or subtraction << carry
	 * needs to be added in left side so this is being done.
	 */
	
	public static int intSum(int a,int b)
	{
		int carry;
		while(b!=0)
		{
			carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
	
	public static int intSub(int a,int b)
	{
		int borrow;
		while(b!=0)
		{
			borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}
		return a;
	}

}
