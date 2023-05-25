import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort
{
	private static int passCount;

	public static void mergeSort(int[] list)
	{
		passCount = 0;
		System.out.println();
		mergeSort(list, 0, list.length);
	}

	private static void mergeSort( int[] list, int front, int back)  //O( Log N )
	{
		int mid = (front + back) / 2;
		if (mid == front) return;
		mergeSort(list, front, mid);
		mergeSort(list, mid, back);
		merge(list, front, back);
		System.out.print("pass " + passCount++ + " [");
		for(int k = 0; k < list.length - 1; k++)
		{
			System.out.print(list[k] + ", ");
		}
		System.out.println(list[list.length-1]+"]");
	}

	private static void merge(int[] list, int front, int back)  //O(N)
	{
		int dif = back - front;
		int spot = 0;
		int[] temp = new int[dif];
		int beg = front;
		int mid = (front + back) / 2;
		int saveMid = mid;
		while(beg < saveMid && mid < back)
		{
			if(list[beg] < list[mid])
			{
				temp[spot] = list[beg];
				spot++;
				beg++;
			} else
			{
				temp[spot] = list[mid];
				spot++;
				mid++;
			}
		}
		while(beg < saveMid)
		{
			temp[spot] = list[beg];
			spot++;
			beg++;
		}
		while(mid < back)
		{
			temp[spot] = list[mid];
			spot++;
			mid++;
		}
		for(int k = 0; k < dif; ++k)
		{
			list[front + k] = temp[k];
		}
	}
}