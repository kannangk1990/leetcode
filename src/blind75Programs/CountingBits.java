package blind75Programs;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countbits(9)));
		
	}

	public static int[] countbits(int n)
	{
		int[] ans = new int[n+1];
		for(int i=1;i<=n;i++)
		{
			//i>>1 does right shift which is div by 2
			// i&1 does bit wise and which gets only last digit
			// start from 1 which calculates for 0 and goes till n
			ans[i]=ans[i>>1]+(i&1);
		}
		
		return ans;
	}
}
