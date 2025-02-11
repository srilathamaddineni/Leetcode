class Pair{
    int first,second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {

    public void bfs(int row,int col,char[][] grid,int[][] vis)
    {
          Queue<Pair> q=new LinkedList<>();
          q.add(new Pair(row,col));
          int m=grid.length;
          int n=grid[0].length;
          vis[row][col]=1;
          int dx[]={0,1,0,-1};
          int dy[]={1,0,-1,0};
          while(!q.isEmpty())
          {
              int row1=q.peek().first;
              int col1=q.peek().second;
              q.remove();
              for(int i=0;i<4;i++)
              {
                   
                       int nrow=row1+dx[i];
                       int ncol=col1+dy[i];
                       if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0)
                       {
                          vis[nrow][ncol]=1;
                          q.add(new Pair(nrow,ncol));
                       }
              }
          }
    }

    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int cnt=0;
         
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(vis[i][j]==0 && grid[i][j]=='1')
               {
                  bfs(i,j,grid,vis);
                  cnt++;
               }
            }
        }
        return cnt;
    }
}