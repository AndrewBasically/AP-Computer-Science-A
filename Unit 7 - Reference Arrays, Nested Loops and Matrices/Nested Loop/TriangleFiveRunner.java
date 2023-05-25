import static java.lang.System.*;
import java.util.Scanner;


public class TriangleFiveRunner
{
   public static void main(String args[])
   {
   Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the letter : ");
			char let = keyboard.next().charAt(0);
			out.print("Enter the amount : ");
			int amount = keyboard.nextInt();

				//static methods can be called using the class name
			System.out.println( TriangleFive.go( amount, let ) );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}