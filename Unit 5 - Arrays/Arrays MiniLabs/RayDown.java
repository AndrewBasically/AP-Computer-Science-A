public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
      for ( int k = 1; k < numArray.length; k++ ) {
         if ( numArray[ k - 1 ] <= numArray[k] ) {
            return false;
         }
      }
		return true;
	}	
}