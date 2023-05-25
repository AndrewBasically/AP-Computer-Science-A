import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
      int sum = 0;
      for (int item : ray) {
         sum += item;
      }
		return sum;
	}
}