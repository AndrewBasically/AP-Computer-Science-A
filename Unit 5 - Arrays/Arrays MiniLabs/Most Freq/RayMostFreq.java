public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
      int[] occurrences = new int[ray.length];
      for ( int i = 0; i < ray.length; i++ ) {
         for ( int k = i + 1; k < ray.length; k++ ) {
            if ( ray[i] == ray[k] ) {
               occurrences[i]++;
            }
         }
      }
      
      int greatest = 0;
      int loc = 0;
      for ( int k = 0; k < occurrences.length; k++ ) {
         if ( occurrences[k] > greatest ) {
            greatest = occurrences[k];
            loc = k;
         }
      }
      
      return ray[loc];
	}
}