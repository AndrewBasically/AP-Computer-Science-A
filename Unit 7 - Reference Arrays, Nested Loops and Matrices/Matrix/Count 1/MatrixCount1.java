import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};
    public static int count( int val  )
    {
      int count = 0;
      for (int[] row : m) {
         for (int col : row) {
            if (col == val) {
               count++;
            }
         }
      }
		return count;
    }
}
