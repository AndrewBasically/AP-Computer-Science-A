import java.util.Scanner;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add a Scanner for keyboard input
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter x1 :: " );
		int x1 = kb.nextInt();
      System.out.print( "Enter y1 :: " );
		int y1 = kb.nextInt();
      System.out.print( "Enter x2 :: " );
		int x2 = kb.nextInt();
      System.out.print( "Enter y2 :: " );
		int y2 = kb.nextInt();
		
		//add test cases	
      Distance dist = new Distance();    
      System.out.println( "\n\ndistance :: " + String.format("%.3f", dist.getDistance(x1,y1,x2,y2)) );		
	}
}

/*

Sample Data :
1 1 2 1
1 1 -2 2
1 1 0 0 
 


Sample Output : 
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
distance == 1.000


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
distance == 3.162


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/