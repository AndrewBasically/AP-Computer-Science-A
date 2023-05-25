public class FirstLast
{
   public static String go( String a, String b )
	{
		return a.substring(0,1) + b.substring(b.length()-1,b.length());
	}
}