public class Filmst
{
   public static void main(String [] args)
   {
      // Create an array called watch that contains a list of 4 film objects
      Film[] watch = new Film[4];
      // Initialize the values of each object in the array.
      watch[0] = new Film("Shrek",133,"PG");
      watch[1] = new Film("Road to Perdition",117,"G");
      watch[2] = new Film("The Truth about Cats and Dogs",93,"PG");
      watch[3] = new Film("Enigma",114,"G");
      // loop to increase the length time of each object in the array by 10%
      for ( Film item : watch ) {
         item.setLength( (int) ( item.getLength() * 1.1 ) );
      }   
      // loop to display the film information of each object in the array.
      for ( Film item : watch ) {
         item.display();
      }
      // loop to find and display the shortest film information.
      int min = watch[0].getLength();  
      int count = 0;
      for ( int k = 0; k < watch.length; k++ ) {
         if ( watch[k].getLength() < min ) {
            min = watch[k].getLength();
            count = k;
         }
      }
      System.out.println("And the shortest film is .....");
      watch[count].display();
   }
}
class Film{
   String title;
   int length;
   String rating; // "G", "PG", "PG-13", "R"
   
   public Film (String sname, int min, String r)
   {
      title = sname;
      length = min;
      rating = r;
   }
   public void display()
   {
      System.out.println("Title: " + title);
      System.out.println("Length: " + length);
      System.out.println("Rating: " + rating + "\n");
   }
   public int getLength()  
   {
      return length;
   }
   public void setLength(int len)
   {
      length = len;
   }
}