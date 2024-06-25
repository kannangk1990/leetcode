package blind75Programs;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] nums= {0,1,3,4,5,2};
		System.out.println(missingNumbers(nums));

	}
	
	public static int missingNumbers(int[] nums)
	{
		int num = nums.length;
		int originalSum = num*(num+1)/2;
		int actualSum=0;
		
		for(int i=0;i<nums.length;i++)
		{
			actualSum += nums[i];
		}
		
		return originalSum-actualSum;
	}

}
