import java.util.List;
import java.util.ArrayList;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{
      ArrayList<Integer> list = new ArrayList<Integer>();
      for ( int item : ray ) {
         if ( item > ray.get( ray.size()-1 ) ) {
            list.add(item);
         }
      }
      return list;
	}
}