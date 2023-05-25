import java.util.Scanner;
import static java.lang.System.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		//use a Scanner for keyboard input		
		Scanner kb = new Scanner( System.in );
      System.out.print( "Enter a :: " );
      int a = kb.nextInt();
      System.out.print( "Enter b :: " );
      int b = kb.nextInt();
      System.out.print( "Enter c :: " );
      int c = kb.nextInt();
      
		//add test cases
      Quadratic quad = new Quadratic();    
      System.out.println( "\n\nrootone :: " + String.format("%.2f", quad.getRootOne(a,b,c)) );
      System.out.println( "\n\nroottwo :: " + String.format("%.2f", quad.getRootTwo(a,b,c)) );
	}
}