public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for (int num = 0; num<number; count++)
		{
			number/=10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int [getNumDigits(number)];
		for (int num = 0; num<sorted.length; num++)
		{
			sorted[num] = number%10;
			if (number > 0) 
			{
				number/=10;
			}
		}
		for (int k = 0; k < sorted.length; k++)
		{
			int small = k;
			for (int m = k + 1; m < sorted.length; m++)
			{
				if (sorted[small] > sorted[m])
				{
					small = m;
				}
			}
			int temp = sorted[small];
			sorted[small] = sorted[k];
			sorted[k] = temp;
		}
		return sorted;
	}
}