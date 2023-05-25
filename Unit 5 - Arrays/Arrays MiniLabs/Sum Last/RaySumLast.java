public class RaySumLast
{
	public static int go(int[] ray)
	{
   int sum = 0;
      for ( int k = 0; k < ray.length; k++ ) {
         if ( ray[k] > ray[ ray.length - 1 ] ) {
            sum += ray[k];
         }
      }
      if ( sum == 0 ) {
         return -1;
      }
      return sum;
	}
}