import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
      int smallest = ray.get(0);
      int largest = ray.get(0);
      for (int item : ray) {
         if (item < smallest) {
            smallest = item;
         }
         if (item > largest) {
            largest = item;
         }
      }
      return ((double) largest + smallest ) / 2;
	}
}