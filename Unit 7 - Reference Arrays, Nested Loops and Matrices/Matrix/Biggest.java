public class Biggest
{
    public static int getBig(int[][] m)
    {
      int big = Integer.MIN_VALUE;
      for (int[] row : m) {
         for (int item : row){
            if (item >= big) {
               big = item;
            }
         }
      }
		return big;
    }
}
