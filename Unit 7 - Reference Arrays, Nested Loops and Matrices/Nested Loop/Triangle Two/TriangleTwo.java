public class TriangleTwo
{
	public static String go( int size, String let )
	{
		String output="";
      for (int i = 1; i <= size; i++) {
         for (int j = size; j >= i; j--) {
            output += let;
         }
            output += "\n";
        }
		return output;
	}
}