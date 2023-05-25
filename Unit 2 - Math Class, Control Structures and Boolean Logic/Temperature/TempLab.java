import java.util.Scanner;

public class TempLab
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("OK, mate, what's the temperature outside? ");
		int temp = in.nextInt();
		
		// write the code to complete the lab 
      String playableSports = "Looks good for .......\n\n";
		if (temp  >= 75) { playableSports += "Swimming\n"; }
      if ((temp > 60) && (temp <= 85)) { playableSports += "Tennis\n"; }
      if ((temp > 10) && (temp <= 32)) { playableSports += "Skiing\n"; }
      if (temp <= 10) { playableSports += "Checkers\n"; }
      if ((temp > 32) && (temp <= 70)) { playableSports += "Soccer\n"; }
      System.out.print(playableSports);
	}
}


