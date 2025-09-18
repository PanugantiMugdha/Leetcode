public class Solution
{
    public static int[] findMissingAndRepeatedValues(int[][] grid)
    {
        int n=grid.length;
        int M=n*n;
        int repeated=0;
        int missing=0;
        boolean[] seen=new boolean[M+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int v=grid[i][j];
                if(seen[v]==true)
                {
                    repeated=v;
                }
                else
                {
                    seen[v]=true;
                }
            }
        }
        for(int v=1;v<=M;v++)
        {
            if(seen[v]==false)
            {
                missing=v;
                break;
            }
        }
        return new int[] {repeated,missing};
    }
}
