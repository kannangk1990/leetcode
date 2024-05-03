package blind75Programs;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));

	}
	
	public static boolean canJump(int[] nums)
	{
		int indexPosition = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			if (i>indexPosition)
				return false;
			indexPosition = Math.max(indexPosition, i+nums[i]);
		}
		
		return true;
	}

}
