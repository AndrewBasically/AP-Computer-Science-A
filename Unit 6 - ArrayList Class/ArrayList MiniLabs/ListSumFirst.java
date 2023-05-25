import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go( List<Integer> ray)
	{
		int sum = 0;
      for ( int item : ray ) {
         if ( item > ray.get(0) ) {
            sum += item;
         }
      }
      if ( sum == 0 ){
         sum = -1;
      }
      return sum;
	}
}