import java.util.*;
public class RectRunner
{
   public static void main( String[] args )
   {
      try (Scanner kb = new Scanner( System.in )) {
         System.out.print( "Enter the length :: " );
         int length = kb.nextInt();
         System.out.print( "Enter the width :: " );
         int width = kb.nextInt();
         int perimeter = (length*2)+(width*2);
         System.out.println(perimeter);
      }      
   }
}