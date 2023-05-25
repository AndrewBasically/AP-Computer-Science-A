import java.util.Scanner;

public class TriangleArea
{
   public static void main (String args[])
   {
      try (Scanner in = new Scanner(System.in)) {
		System.out.print("Enter base: ");
		int base = in.nextInt();
		System.out.print("Enter height: ");			
 		int height = in.nextInt();
		int area = (base*height)/2;
		
		System.out.println ("Area: " + area);
	}
   }
}