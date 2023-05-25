import java.util.Scanner;
import java.util.*;

public class TempLab2 {
  public static void main(String args[])
	{
      String response = "";
      boolean again = false;
      do{
   		Scanner in = new Scanner(System.in);
   		
   		System.out.print("\nOK, mate, what's the temperature outside? ");
   		int temp = in.nextInt();
   		
   		// write the code to complete the lab 
         String playableSports = "Looks good for .......\n\n";
   		if (temp  >= 75) { playableSports += "Swimming\n"; }
         if ((temp > 60) && (temp <= 85)) { playableSports += "Tennis\n"; }
         if ((temp > 10) && (temp <= 32)) { playableSports += "Skiing\n"; }
         if (temp <= 10) { playableSports += "Checkers\n"; }
         if ((temp > 32) && (temp <= 70)) { playableSports += "Soccer\n"; }
         System.out.print(playableSports);
         
         System.out.print("Want to try again? ");
         response = in.next();
         if (response.equals("y")){
            again = true;
         }else
         {
            again = false;
         }
      }while(again);
	}
}