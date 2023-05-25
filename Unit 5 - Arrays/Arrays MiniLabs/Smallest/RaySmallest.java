public class RaySmallest
{
	public static int go(int[] ray)
	{
      int smallest = ray[0];
      for ( int item : ray ) {
         if ( item < smallest ) {
            smallest = item;
         }
      }
		return smallest;
	}
}