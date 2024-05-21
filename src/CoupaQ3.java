import java.util.Arrays;

public class CoupaQ3 {

	   public static void main(String[] args)
	   {
		   String outcome="WWWLLWLW";
		   System.out.println(Arrays.toString(findTennisScore(outcome)));
	   }
	   
	   public static int[] findTennisScore(String outcome)
	   {
		   int mattScore=0;
		   int jamesScore=0;
		   boolean mattServing=true;
		   
		   for(char result:outcome.toCharArray())
		   {
			   if(mattServing)
			   {
				   if(result == 'W')
					   mattScore++;
				   else
				   {
					   jamesScore++;
					   if(jamesScore>mattScore)
						   mattServing=false;
				   }
			   }
			   else
			   {
				   if(result == 'W')
					   jamesScore++;
				   else
				   {
					   mattScore++;
					   if(mattScore>jamesScore)
						   mattServing=true;
				   }
			   }
			   
		   }
		   
		   
		   return new int[] {mattScore,jamesScore};
	   }
}


