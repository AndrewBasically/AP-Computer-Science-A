import java.util.List;
import java.util.ArrayList;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray )
	{
      for ( int i = 0; i < ray.size(); i++ ) {
         for ( int k = i + 1; k < ray.size(); k++ ) {
            if ( ray.get(i) == ray.get(k) ) {
               return false;
            }
         }
      }
		return true;
	}
} 