import java.util.HashMap;
import java.util.Map;

public class Twosum {

	public static void main(String[] args) {
		
		int[] num = {2,7,10,14};
		int[] solution=twosum(num, 24);
		System.out.println(solution[0]+ "," +solution[1]);
		

	}
	
	public static int[] twosum(int[] nums, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int complement;
		for(int i=0;i<nums.length;i++)
		{
			complement=target-nums[i];
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement),i};
			}
			else
			{
				map.put(nums[i], i);
			}
		}
		
		//return if there is no solution
		return null;
	}

}
