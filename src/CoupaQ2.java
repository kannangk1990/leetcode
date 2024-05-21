import java.util.HashMap;
import java.util.Map;

public class CoupaQ2 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,3,4,4,4};
		System.out.println(findLeastOccurance(arr));
	}
	
	public static int findLeastOccurance(int[] arr)
	{
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i], 1);
		}
		
		int minValue=Integer.MAX_VALUE;
		int key=0;
		for(Map.Entry<Integer, Integer> mapElement:hm.entrySet())
		{
			if(mapElement.getValue()<minValue)
			{
				minValue=mapElement.getValue();
				key=mapElement.getKey();
			}	
				
		}
		
		return key;
	}

}
