public class RayTotal
{
	public static int go(int[] ray)
	{
      int total = 0;
		for (int num : ray) {
         total += num;
      }
      return total;
	}
}