package blind75Programs;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,11};
		System.out.println(containsDuplicate(nums));

	}
	
	public static boolean containsDuplicate(int[] nums)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int num:nums)
		{
			if(hs.contains(num))
				return true;
			hs.add(num);
		}
		return false;
	}

}
