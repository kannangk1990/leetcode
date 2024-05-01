package blind75Programs;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] nums= {2,3,-2,4};
		int[] nums1= {-2,0,-1};
		int[] nums2= {0,2};
		System.out.println(maxProductSubArray(nums));
		System.out.println(maxProductSubArray(nums1));
		System.out.println(maxProductSubArray(nums2));

	}
	
	public static int maxProductSubArray(int[] nums)
	{
		int productValue=1;
		int maxValue=nums[0];
		
		for(int i=0;i<nums.length-1;i++)
		{
			productValue *= nums[i];
			maxValue = Math.max(maxValue, productValue);
			
			if(productValue==0)
				productValue=1;
		}
		
		productValue=1;
		for(int i=nums.length-1;i>=0;i--)
		{
			productValue *= nums[i];
			maxValue = Math.max(maxValue, productValue);
			
			if(productValue==0)
				productValue=1;
		}
		
		
		return maxValue;
	}

}
