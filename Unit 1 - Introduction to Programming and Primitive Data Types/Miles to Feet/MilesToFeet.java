public class MilesToFeet
{
   public static void main( String[] args )
   {
      int startInches = 100000;
      int miles = startInches / 63360;
      int yards = (startInches % 63360) / 36;
      int feet = ((startInches % 63360) % 36) / 12;
      int inches = (((startInches % 63360) % 36) % 12);
      System.out.println("Starting inches: " + startInches);
      System.out.println("Miles: " + miles);
      System.out.println("Yards: " + yards);
      System.out.println("Feet: " + feet);
      System.out.println("Inches: " + inches);
   }
}