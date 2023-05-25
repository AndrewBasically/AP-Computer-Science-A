public class BoxWord
{
	public static String go( String word )
	{
		String output="";
      output += word;
      int cnt = word.length() - 1;
      for (int i = 1; i  < word.length() - 1; i++)
      {
         output += "\n" + word.charAt(i);
         cnt--;
         for (int j = 0; j < word.length() - 2; j++)
         {
            output += " ";
         };
         output +=word.charAt(cnt);
      };
      if (word.length() - 1 != 0)
      {
         StringBuffer sb = new StringBuffer(word);
         output += "\n" + sb.reverse();
      }
      return output+"\n";	}
}