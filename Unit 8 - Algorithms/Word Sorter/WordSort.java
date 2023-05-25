import java.util.Arrays;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   wordRay = line.split(" ");
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		for (int k = 0; k < wordRay.length-1; k++)
		{
			int small = k;
			for (int m = k + 1; m < wordRay.length; m++)
			{
				if (wordRay[small].compareTo(wordRay[m]) > 0)
				{
					small = m;
				}
			}
			String temp = wordRay[small];
			wordRay[small] = wordRay[k];
			wordRay[k] = temp;
		}
	}

	public String toString( )
	{
		String output="";
		for (int k = 0; k < wordRay.length; k++)
		{
			output += "word " + k + " :: " + wordRay[k] + "\n";
		}
		return output+"\n\n";
	}
}