public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String [rows][cols];
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				grid[i][j] = vals[(int)Math.floor(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = vals[0];
		int count = 0; 
		int index = 0;
		while(index < vals.length)
		{
			for(int x = 0; x < grid.length; x++)
			{
				String tempMax = vals[index];
				int tempCount = 0;
				for(int y = 0; y < grid[x].length; y++)
				{
					if(grid[x][y].equals(tempMax))
					{
						tempCount++;
					}
				}
				if(tempCount > count)
				{
					max = tempMax;
				}
			}
			index++;
		}
		return max + " occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	/*private int countVals( String val )
	{
      int count = 0;
      for(String[] row: grid)
      {
         for(String let: row)
         {
            if(let.equals(val))
            {
               count++;
            }
         }
      }
		return count;
	}*/

	//display the grid
	public String toString()
	{
		String output="";
		for(int a = 0; a < grid.length; a++)
		{
			for(int b = 0; b < grid[a].length; b++)
			{
				output+=grid[a][b];
			}
			output+="\n";
		}
		return output;
	}
}