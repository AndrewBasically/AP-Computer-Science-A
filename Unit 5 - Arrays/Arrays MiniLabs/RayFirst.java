public class RayFirst
{
	public static boolean go(int[] ray)
	{
		boolean repeat = false;
      for ( int k = 1; k < ray.length; k++ ) {
         if ( ray[k] == ray[0] ) {
            return true;
         }
      }
      return false;
	}
}