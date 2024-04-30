package blind75Programs;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] arr1 = {-2};
		System.out.println(maxSubArray(arr));
		System.out.println(maxSubArray(arr1));

	}
	
	public static int maxSubArray(int[] arr)
	{
		int sum=0;
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            max=Math.max(sum,max);
            if (sum<0)
                sum=0;
        }
		
		return max;
	}

}
