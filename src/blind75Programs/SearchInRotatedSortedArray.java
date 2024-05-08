package blind75Programs;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums1= {4,5,6,7,0,1,2};
		int[] nums2= {4,5,6,7,0,1,2};
		int[] nums3= {1};
		int[] nums4= {5,1,3};
		int[] nums5= {3,1};
		
		int target1=0;
		int target2=3;
		int target3=0;
		int target4=3;
		int target5=1;

		
		System.out.println(searchInRotatedSortedArray(nums1,target1));
		System.out.println(searchInRotatedSortedArray(nums2,target2));
		System.out.println(searchInRotatedSortedArray(nums3,target3));
		System.out.println(searchInRotatedSortedArray(nums4,target4));
		System.out.println(searchInRotatedSortedArray(nums5,target5));
	}
	
	public static int searchInRotatedSortedArray(int[] nums,int target)
	{
		int start=0;
		int end=nums.length-1;
		int mid=0;
		//<= is needed to handle only 2 elements in array
		while(start<=end)
		{
			mid=(start+end)/2;
			if(nums[mid]==target)
				return mid;
			
			if(nums[start]<=nums[mid])
			{
				if(nums[mid]>target && nums[start]<=target)
					end=mid-1;
				else
					start=mid+1;
			}
			else
			{
				if(nums[mid]<target && nums[end]>=target)
					start=mid+1;
				else
					end=mid-1;
			}
		}
		
		
		return -1;
	}

}
