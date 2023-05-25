public class Middle
{
	//pre : a.length() > 1
	//post : midddle letter of string a returned
   public static String go( String a )
	{
		return a.substring(a.length()/2,a.length()/2+1);
	}
}