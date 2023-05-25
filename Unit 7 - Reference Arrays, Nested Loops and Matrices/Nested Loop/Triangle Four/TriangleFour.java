public class TriangleFour
{
	public static String go( int size, String let )
	{
		String output="";
      for (int i = size; i > 0; i--) {
        for (int j = 1; j < size - i + 1; j++) {
            output += " ";
        }
        for (int k = 1; k <= i; k++) {
            output += let;
        }
        output += "\n";
    }
		return output;
	}
}