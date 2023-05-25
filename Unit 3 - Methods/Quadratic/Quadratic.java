public class Quadratic
{
	public static double getRootOne( int a, int b, int c )
	{
		double rootOne = (-b+Math.sqrt(b*b-4.0*a*c))/(2*a);
      return rootOne;
	}
	
	public static double getRootTwo( int a, int b, int c )
	{
		double rootTwo = (-b-Math.sqrt(b*b-4.0*a*c))/(2*a);
      return rootTwo;
	}
}