public class RayGetFirst
{
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static int[] go(int[] ray)
	{
      int count = 0;
      for ( int item : ray ) {
         if ( item > ray[0] ) {
            count++;
         }
      }
      
      int[] greaterThanFirst = new int[count];
      
      int pos = 0;
      for ( int item : ray ) {
         if ( item > ray[0] ) {
            greaterThanFirst[pos] = item;
            pos++;
         }
      }
      
      return greaterThanFirst;
	}
}