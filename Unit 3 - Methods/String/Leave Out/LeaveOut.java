public class LeaveOut
{
	//pre : a.length() > 1
	//post : string returned minus character at i
   public static String go( String a, int i)
	{
		return a.substring(0,i) + a.substring(i+1,a.length());
	}
}