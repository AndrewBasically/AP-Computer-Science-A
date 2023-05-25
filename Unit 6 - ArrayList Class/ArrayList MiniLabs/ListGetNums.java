import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
      ArrayList<Integer> array = new ArrayList<Integer>();
      int count = 0;
      for ( int item : ray ) {
         if ( count < 3 ) {
            if ( item > 11 ) {
               array.add( item );
               count++;
            }
         }
      }
		return array;
	}
}