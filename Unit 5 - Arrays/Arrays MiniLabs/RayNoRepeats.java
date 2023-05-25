public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{	
      for ( int i = 0; i < ray.length; i++ ) {
         for ( int k = i + 1; k < ray.length; k++ ) {
            if ( ray[i] == ray[k] ) {
               return false;
            }
         }
      }
		return true;
	}
}