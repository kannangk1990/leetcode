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
	
	/*
	 * Need to create algorithm with O(log n) run time which can be achieved using
	 * binary search only
	 */
	public static int numRoatedSortedArray(int[] nums)
	{
		int start=0;
		int end=nums.length-1;
		int mid=0;
		while(start<end)
		{
			mid=start+(end-start)/2;
			if(nums[mid]>nums[end])
			{
				start=mid+1;
			}
			else
			{
				end=mid;
			}
		}
		
		return nums[start];
	}

}
