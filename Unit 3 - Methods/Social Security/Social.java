import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
      setWord("");
	}

	public Social(String soc)
	{
      setWord(soc);
	}


	public void setWord(String w)
	{
      sum = 0;
      socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
      int first = socialNum.indexOf("-");
      int last = socialNum.lastIndexOf("-");
      sub = socialNum.substring(0,first) + socialNum.substring(first+1,last) + socialNum.substring(last+1,socialNum.length());
      sum += Integer.valueOf(socialNum.substring(0,first));
      sum += Integer.valueOf(socialNum.substring(first+1,last));
      sum += Integer.valueOf(socialNum.substring(last+1,socialNum.length()));
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}