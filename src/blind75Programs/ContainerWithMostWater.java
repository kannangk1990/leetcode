package blind75Programs;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] heights= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(heights));

	}
	
	public static int maxArea(int[] heights)
	{
		int left=0;
		int right=heights.length-1;
		int currentArea=0;
		int maxArea=0;
		
		int minHeight=0;
		
		while(left<right)
		{
			minHeight = Math.min(heights[left], heights[right]);
			currentArea = minHeight*(right-left);
			maxArea=Math.max(maxArea, currentArea);
			
			while(left<right && heights[left]<=minHeight)
				left++;
			
			while(left<right && heights[right]<=minHeight)
				right--;
		}
		return maxArea;
	}

}
