package blind75Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {

	public static void main(String[] args) {
		int[] arr = {5,-3,9,0,-1,1,-5,3,-9};
		System.out.println(threesum(arr));
	}
	
	public static List<List<Integer>> threesum(int[] arr)
	{
		List<List<Integer>> solutions = new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				continue;
			}
			
			int j=i+1;
			int k=arr.length-1;
			
			while(j<k)
			{
				int sum=arr[i]+arr[j]+arr[k];
				
				if(sum>0)
				{
					k--;
				}
				
				else if(sum<0)
				{
					j++;
				}
				
				else
				{
					solutions.add(Arrays.asList(arr[i],arr[j],arr[k]));
					j++;
					if(arr[j]==arr[j-1] && j<k)
					{
						j++;
					}
				}
			}
		}
		
		
		return solutions;
	}

}
