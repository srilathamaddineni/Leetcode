class Solution {
    public void dfs(int grid[][],int vis[][],int row,int col)
    {

       int m=grid.length;
       int n=grid[0].length;
       int dx[]={-1,0,1,0};
       int dy[]={0,1,0,-1};
       vis[row][col]=1;
       for(int i=0;i<4;i++)
       {
           int nrow=row+dx[i];
           int ncol=col+dy[i];
           if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && grid[row][col]==1 && vis[nrow][ncol]==0)
           {
              dfs(grid,vis,nrow,ncol);
           }

       }

    }
    public int numEnclaves(int[][] grid) {
         int m=grid.length;
         int n=grid[0].length;
         int vis[][]=new int[m][n];
         int cnt=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if ((i == 0 || j == 0 || i == m- 1 || j == n- 1) && grid[i][j] == 1)
                {
                    dfs(grid,vis,i,j);
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                  cnt++;
            }
        }
        return cnt;
    }
}