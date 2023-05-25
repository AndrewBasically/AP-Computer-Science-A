import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go( List<Integer> numArray)
	{
		for (int k = 1; k < numArray.size(); k++) {
         if (numArray.get(k) >= numArray.get(k-1)) {
            return false;
         }
      }
      return true;
	}	
}