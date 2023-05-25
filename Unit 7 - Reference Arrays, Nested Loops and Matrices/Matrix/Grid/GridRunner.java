import java.io.IOException;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid x = new Grid(7, 7, new String[]{"A","B","D","#","G","3"});
		System.out.println( x );
		System.out.println( x.findMax( new String[]{"X","A","B"}) );
	}
}