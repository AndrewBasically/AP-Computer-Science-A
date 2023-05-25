public class MatrixSumming2
{
    private int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}};   //load in the matrix values

    public int sum( int r, int c )
    {
        int sum = 0;
        for(int i = r-1; i <= r+1; i++)
        {
            for(int j = c-1; j <= c+1; j++)
            {
                if(i<0 || i>m.length-1 || j<0 || j>m[i].length-1)
                {
                    
                }
                else
                {
                    sum+=m[i][j];
                }
            }
        }
        sum-=m[r][c];
        sum++;
        return sum;
    }

    public String toString()
    {
    	return "";
    }
}