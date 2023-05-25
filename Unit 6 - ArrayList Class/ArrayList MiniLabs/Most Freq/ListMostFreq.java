import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( List<Integer> ray )
	{
      int[] occurrences = new int[ray.size()];
      for ( int j = 0; j < ray.size(); j++ ) {
         for ( int k = j + 1; k < ray.size(); k++ ) {
            if ( ray.get(j) == ray.get(k) ) {
               occurrences[j]++;
            }
         }
      }
      
      int greatest = 0;
      int loc = 0;
      for ( int k = 0; k < occurrences.length; k++ ) {
         if ( occurrences[k] > greatest ) {
            greatest = occurrences[k];
            loc = k;
         }
      }
      return ray.get(loc);
	}
}