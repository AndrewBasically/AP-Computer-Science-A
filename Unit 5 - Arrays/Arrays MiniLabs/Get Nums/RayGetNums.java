public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
      int[] first3 = new int[3];
      int pos = 0;   
      for ( int k = 0; k < ray.length; k++ ) {
         if ( ray[k] > 11 && pos < 3 ) {
            first3[pos] = ray[k];
            pos++;
         }
      }
      return first3;
	}
}