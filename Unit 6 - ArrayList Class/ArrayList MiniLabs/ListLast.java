import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
      for ( int k = 0; k < ray.size() - 1; k++ ) {
         if ( ray.get(k) == ray.get( ray.size() - 1 )) {
            return true;
         }
      }
		return false;
	}
}