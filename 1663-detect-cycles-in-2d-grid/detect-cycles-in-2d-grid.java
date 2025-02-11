class Solution {
    public boolean bfs(char[][] grid,int[][] vis,int row,int col)
    {
        int dx[]={0,-1,0,1};
        int dy[]={1,0,-1,0};
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{row,col,-1,-1});
        vis[row][col]=1;
        while(!q.isEmpty())
        {
            int arr[]=q.poll();
            int row1=arr[0];
            int col1=arr[1];
            int parentRow=arr[2];
            int parentCol=arr[3];
            for(int k=0;k<4;k++)
            {
                int nrow=row1+dx[k];
                int ncol=col1+dy[k];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==grid[row1][col1] )
                {
                    if((vis[nrow][ncol]==1) && (nrow!=parentRow || ncol!=parentCol))
                    {
                        return true;
                    }
                    if(vis[nrow][ncol]==0)
                    {
                        q.offer(new int[]{nrow,ncol,row1,col1});
                        vis[nrow][ncol]=1;
                    }
                }
            }
           

        }
         return false;
    }
    public boolean containsCycle(char[][] grid) {
        if(grid.length==0 || grid[0].length==0)return false;
        int visit[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(visit[i][j]==0)
                {
                if(bfs(grid,visit,i,j))
                  return true;
                }
            }
        }
        return false;
    }
    
}