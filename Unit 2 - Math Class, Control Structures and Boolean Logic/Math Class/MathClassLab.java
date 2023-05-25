public class MathClassLab
{
	public static void main (String args[])
	{
		int n = (int) Math.ceil(Math.random()*4); // generate a random number between 1 and 3 inclusive
      
		if (n==1)
		{
			//write code to find and display the area of a circle with radius 10 units. Must use Math.PI
         System.out.print(Math.PI*Math.pow(10,2));
		}
		
		if (n==2)
		{
			//write code to find and display the volume of a sphere with radius 10 units. Must use Math.PI
         System.out.print(4.0/3*Math.PI*Math.pow(10,3));
		}
		
		if (n==3)
		{
			//write code to find and display the distance between (5, 5) and (12, 6)
			// use the distance formula 
         System.out.print(Math.sqrt(Math.pow(12-5,2)+Math.pow(6-5,2)));
		}
			
			
	}
}

