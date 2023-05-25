import java.util.Scanner;

public class Lab05a1vst
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter the 1st numerator ----> ");
      int num1 = keyboard.nextInt();
      System.out.print("\nEnter the 1st denominator --> ");
      int den1 = keyboard.nextInt();
      System.out.print("\nEnter the 2nd numerator ----> ");
      int num2 = keyboard.nextInt();
      System.out.print("\nEnter the 2nd denominator --> ");
      int den2 = keyboard.nextInt();
      System.out.println();
      
      Rational r1 = new Rational(num1,den1);
      Rational r2 = new Rational(num2,den2);
      Rational r3 = new Rational();
      
      r3.showMultiply(r1,r2);    // required for 80-points
      //r3.showDivide(r1,r2);      // required for 80-points
      //r3.showAdd(r1,r2);         // required for 100-points
      //r3.showSubtract(r1,r2);    // required for 100-points
   }
}


class Rational
{
   private int num;
   private int den;

   public Rational(){
      
   }
   
   // Complete for 80-Points
   public Rational(int n, int d) 
   {
      num = n;
      den = d;
   }

   // Complete for 80-Points
   public double getDecimal() 
   { 
      double output = (double) num / den;
      return output;
   }
   
   // Complete for 80-Points
   public String getRational() 
   { 
      String output = num + "/" + den;
      return output; 
   }

   // Complete for 100-Points
   public String getReduced() 
   {
      int gcf = getGCF(num,den);
      int reducedNum = num / gcf;
      int reducedDen = den / gcf;
   	  
   //  return reducedNum + "/" + reducedDen;
      String output = reducedNum + "/" + reducedDen;
      return output;
   }

   // Method for 80-Points; Change for 100-Points
   public void displayData()
   {
      System.out.println();
      System.out.println(getRational() + " equals " + getDecimal());
      System.out.println();
      System.out.println("and reduces to " + getReduced());
      System.out.println();
   }

   // Use the helper method getGCF for 100-Points// private methods are helper methods
   
   private int getGCF(int n1,int n2)
   {   
      int rem = 0;
      int gcf = 1;
      do
      {
         rem = n1 % n2;
         if (rem == 0)
            gcf = n2;
         else
         {
            n1 = n2;
            n2 = rem;
         }
      }
      while (rem != 0);
       
      return gcf;
   
   }
   
   // Required for 80-points
   public void showMultiply(Rational r1, Rational r2)
   {
      String r1Reduced = r1.getReduced();
      String r2Reduced = r2.getReduced();
      System.out.println(r1Reduced);
      System.out.println(r2Reduced);
      
      int r1Num = 0;
      int r1Den = 0;
      boolean num = true;
      
      for ( int k = 0; k < r1Reduced.length(); k++ ) {
         if ( !( r1Reduced.substring( k, k+1 ).equals( "/" ) ) && num ) {
            r1Num += Integer.parseInt( r1Reduced.substring( k, k+1 ) );
         } else {
            num = false;
         }
         if ( !num ) {
            r1Den += Integer.parseInt( r1Reduced.substring( k, k+1 ) );
         }
      }
      
   }
   
   // Required for 80-points
   public void showDivide(Rational r1, Rational r2)
   {
      
   }
   
   // Required for 100-points
   public void showAdd(Rational r1, Rational r2)
   {
   
   }
   
   // Required for 100-points
   public void showSubtract(Rational r1, Rational r2)
   {
      
   }
}