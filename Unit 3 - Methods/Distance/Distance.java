public class Distance
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		double distance = Math.sqrt( (xTwo - xOne)*(xTwo - xOne) + (yTwo - yOne)*(yTwo - yOne) );
      return distance;	
	}
}