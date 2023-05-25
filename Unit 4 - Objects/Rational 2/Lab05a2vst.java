import java.util.Scanner;

public class Lab05a2vst
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
      r3.showDivide(r1,r2);      // required for 80-points
      r3.showAdd(r1,r2);         // required for 100-points
      r3.showSubtract(r1,r2);    // required for 100-points
   }
}




class Rational
{
   private int num;     
   private int den;     

   // Required for 80-points
   public Rational()
   {
      
   }

   // Required for 80-points
   public Rational(int n, int d)
   {
      num = n;
      den = d;
   }
   
   // Required for 80-points
   public String getRational() 
   { 
      String output = num + "/" + den;
      return output;
   }

   // Required for 80-points
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
   public String getReduced()
   {
      int gcf = getGCF(num,den);
      int reducedNum = num / gcf;
      int reducedDen = den / gcf;
   	  
   //  return reducedNum + "/" + reducedDen;
      String output = reducedNum + "/" + reducedDen;
      return output;

   }

   // Required for 80-points
   public void showMultiply(Rational r1, Rational r2)
   {
      int r1DividePos = 0;
      int r2DividePos = 0;
      
      for ( int k = 0; k < r1.getReduced().length(); k++ ) {
         if ( r1.getReduced().substring( k, k+1 ).equals("/") ) {
            r1DividePos = k;
         }
      }
      
      int r1Num = Integer.valueOf( r1.getReduced().substring( 0, r1DividePos ) );
      int r1Den = Integer.valueOf( r1.getReduced().substring( r1DividePos + 1, r1.getReduced().length() ) );
      
      for ( int k = 0; k < r2.getReduced().length(); k++ ) {
         if ( r2.getReduced().substring( k, k+1 ).equals("/") ) {
            r2DividePos = k;
         }
      } 
      
      int r2Num = Integer.valueOf( r2.getReduced().substring( 0, r2DividePos ) );
      int r2Den = Integer.valueOf( r2.getReduced().substring( r2DividePos + 1, r1.getReduced().length() ) );
      
      int num = r1Num * r2Num;
      int den = r1Den * r2Den;
      
      int gcf = r1.getGCF(num, den);
      int reducedNum = num / gcf;
      int reducedDen = den / gcf;
      
      System.out.println( r1.getRational() + " * " + r2.getRational() + " = " + reducedNum + "/" + reducedDen );
   }
   
   // Required for 80-points
   public void showDivide(Rational r1, Rational r2)
   {
      int r1DividePos = 0;
      int r2DividePos = 0;
      
      for ( int k = 0; k < r1.getReduced().length(); k++ ) {
         if ( r1.getReduced().substring( k, k+1 ).equals("/") ) {
            r1DividePos = k;
         }
      }
      
      int r1Num = Integer.valueOf( r1.getReduced().substring( 0, r1DividePos ) );
      int r1Den = Integer.valueOf( r1.getReduced().substring( r1DividePos + 1, r1.getReduced().length() ) );
      
      for ( int k = 0; k < r2.getReduced().length(); k++ ) {
         if ( r2.getReduced().substring( k, k+1 ).equals("/") ) {
            r2DividePos = k;
         }
      } 
      
      int r2Num = Integer.valueOf( r2.getReduced().substring( 0, r2DividePos ) );
      int r2Den = Integer.valueOf( r2.getReduced().substring( r2DividePos + 1, r1.getReduced().length() ) );
      
      int num = r1Num * r2Den;
      int den = r1Den * r2Num;
      
      int gcf = r1.getGCF(num, den);
      int reducedNum = num / gcf;
      int reducedDen = den / gcf;
      
      System.out.println( r1.getRational() + " / " + r2.getRational() + " = " + reducedNum + "/" + reducedDen );
   }
   
   // Required for 100-points
   public void showAdd(Rational r1, Rational r2)
   {
      int r1DividePos = 0;
      int r2DividePos = 0;
      
      for ( int k = 0; k < r1.getReduced().length(); k++ ) {
         if ( r1.getReduced().substring( k, k+1 ).equals("/") ) {
            r1DividePos = k;
         }
      }
      
      int r1Num = Integer.valueOf( r1.getReduced().substring( 0, r1DividePos ) );
      int r1Den = Integer.valueOf( r1.getReduced().substring( r1DividePos + 1, r1.getReduced().length() ) );
      
      for ( int k = 0; k < r2.getReduced().length(); k++ ) {
         if ( r2.getReduced().substring( k, k+1 ).equals("/") ) {
            r2DividePos = k;
         }
      } 
      
      int r2Num = Integer.valueOf( r2.getReduced().substring( 0, r2DividePos ) );
      int r2Den = Integer.valueOf( r2.getReduced().substring( r2DividePos + 1, r1.getReduced().length() ) );
      
      int num = ( r1Num * r2Den ) + ( r2Num * r1Den );
      int den = r1Den * r2Den;
      
      int gcf = r1.getGCF(num, den);
      int reducedNum = num / gcf;
      int reducedDen = den / gcf;
      
      System.out.println( r1.getRational() + " + " + r2.getRational() + " = " + reducedNum + "/" + reducedDen );

   }

   // Required for 100-points
   public void showSubtract(Rational r1, Rational r2)
   {
      int r1DividePos = 0;
      int r2DividePos = 0;
      
      for ( int k = 0; k < r1.getReduced().length(); k++ ) {
         if ( r1.getReduced().substring( k, k+1 ).equals("/") ) {
            r1DividePos = k;
         }
      }
      
      int r1Num = Integer.valueOf( r1.getReduced().substring( 0, r1DividePos ) );
      int r1Den = Integer.valueOf( r1.getReduced().substring( r1DividePos + 1, r1.getReduced().length() ) );
      
      for ( int k = 0; k < r2.getReduced().length(); k++ ) {
         if ( r2.getReduced().substring( k, k+1 ).equals("/") ) {
            r2DividePos = k;
         }
      } 
      
      int r2Num = Integer.valueOf( r2.getReduced().substring( 0, r2DividePos ) );
      int r2Den = Integer.valueOf( r2.getReduced().substring( r2DividePos + 1, r1.getReduced().length() ) );
      
      int num = ( r1Num * r2Den ) - ( r2Num * r1Den );
      int den = r1Den * r2Den; 
      
      int gcf = r1.getGCF(num, den);
      int reducedNum = num / gcf;
      int reducedDen = den / gcf;
      
      System.out.println( r1.getRational() + " - " + r2.getRational() + " = " + reducedNum + "/" + reducedDen );
   }
}