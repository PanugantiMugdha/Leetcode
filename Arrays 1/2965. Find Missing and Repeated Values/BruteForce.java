public class Solution {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int M=n*n;
        int repeated=0;
        int missing=0;
        for(int value=1; value<=M ; value++)
        {
            int count=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==value)
                    {
                        count++;
                    }
                }
            }
            if(count==2)
            {
                repeated=value;
            }
            if(count==0)
            {
                missing=value;
            }
        }
        return new int[] {repeated, missing};
    }
}
