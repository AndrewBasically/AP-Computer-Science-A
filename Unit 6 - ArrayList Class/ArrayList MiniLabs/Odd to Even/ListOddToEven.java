import java.util.List;
import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
      int oddPos = -1;
      for ( int j = 0; j < ray.size(); j++ ) {
         if ( ray.get(j) % 2 == 1 ) {
            oddPos = j;
            j = ray.size();
         }
      }
      
      if ( oddPos == -1 ) {
         return -1;
      }
      
      int evenPos = 0;
      for ( int k = oddPos; k < ray.size(); k++ ) {
         if ( ray.get(k) % 2 == 0 ) {
            evenPos = k;
         }
      }
          
      return evenPos - oddPos;
	}
}