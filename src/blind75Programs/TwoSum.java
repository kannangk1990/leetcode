package blind75Programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 18;
		
		int[] indices=twoSum(nums,target);
		
		for(int i:indices)
		{
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] nums, int target)
	{
		Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
		int length= nums.length;
		
		for(int i=0;i<length;i++)
		{	
			int complement= target-nums[i];
			if(numMap.containsKey(complement))
			{
				return new int[] {i,numMap.get(complement)};
			}
			numMap.put(nums[i], i);
		}
		
		return new int[] {};
	}

}
