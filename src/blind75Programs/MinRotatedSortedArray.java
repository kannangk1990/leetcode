package blind75Programs;

public class MinRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums= {3,4,5,1,2};
		int[] nums1= {4,5,6,7,0,1,2};
		int[] nums2= {11,13,15,17};
		System.out.println(numRoatedSortedArray(nums));
		System.out.println(numRoatedSortedArray(nums1));
		System.out.println(numRoatedSortedArray(nums2));

	}
	
	public static int numRoatedSortedArray(int[] nums)
	{
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]<nums[i-1])
				return nums[i];
		}
		
		return nums[0];
	}

}
