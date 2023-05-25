public class RayOddToEven
{
	public static int go(int[] ray)
	{
      int indexOdd = -1;
		for ( int k = 0; k < ray.length; k++ ) {
         if ( ray[k] % 2 != 0 ) {
            indexOdd = k;
            break;
         }
      }
      
      if ( indexOdd == -1 ) {
         return -1;
      }
      
      int indexEven = -1;
      for ( int k = indexOdd; k < ray.length; k++ ) {
         if ( ray[k] % 2 == 0 ) {
            indexEven = k;
            break;
         }
      }
      
      if ( indexEven == -1 ) {
         return -1;
      }
      
      return indexEven - indexOdd;
	}
}