public class TriangleFive
{
	public static String go( int amount, char letter )
	{
		String output="";
		char temp = letter;
		int count = amount;
		for(int i = 0; i < amount; i++)
		{
			for(int k = 0; k < count; k++)
			{	
				for(int j = amount-k; j > 0; j--)
				{
					output+=temp;
				}
				if(temp == 'z')
				{
					temp = 'a';
				}
				else if(temp == 'Z')
				{
					temp = 'A';
				}
				else
				{
					temp++;
				}
				output+=" ";
			}
			output+="\n";
			temp = letter;
			count--;
		}
		return output;
	}
}