package gfg;

public class TrappedRainWater {

		  public static int trapWater(int[] height) {
		    int trappedWater=0;
		    int left=0,right=height.length-1;
		    int leftMax=0,rightMax=0;
		    
		    while(left<right)
		    {
		    	leftMax=Math.max(leftMax, height[left]);
		    	rightMax=Math.max(rightMax, height[right]);
		    	
		    	if(leftMax<=rightMax)
		    	{
		    		trappedWater+=leftMax-height[left];
		    		left++;
		    	}
		    	else
		    	{
		    		trappedWater+=rightMax-height[right];
		    		right--;
		    	}
		    }

		    return trappedWater;
		  }

		  public static void main(String[] args) {
		    int[] arr = {3, 0, 1, 0, 4, 0, 2};
		    int trappedWater = trapWater(arr);
		    System.out.println("Total amount of water trapped: " + trappedWater);
		  }
		

}


