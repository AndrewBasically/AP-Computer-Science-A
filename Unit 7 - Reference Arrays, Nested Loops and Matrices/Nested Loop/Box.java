public class Box
{
	public static String go( int size )
	{
		String output="";
      for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size+1; j++) {
                if (j <= size+1 - i) {
                    output += "*";
                } else {
                    output += "#";
                }
            }
            output += "\n";
        }
		return output;
	}
}