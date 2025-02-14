



class Solution {
    public void bfs (int mat[][],int vis[][], int dist[][])
    {
        Queue<int[]> q=new LinkedList<>();
        int dx[]={0,1,0,-1};
        int dy[]={1,0,-1,0};
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                  if(mat[i][j]==0)
                  {
                    q.add(new int[]{i, j, 0});
                    vis[i][j]=1;
                  }
            }
        }
        while(!q.isEmpty())
        {
            int arr1[]=q.poll();
            int row1=arr1[0];
            int col1=arr1[1];
            dist[row1][col1]=arr1[2];
            for(int i=0;i<4;i++)
            {
                int nrow=dx[i]+row1;
                int ncol=dy[i]+col1;
                if(nrow>=0 && nrow<mat.length && ncol>=0 && ncol<mat[0].length && vis[nrow][ncol]!=1)
                {
                     vis[nrow][ncol]=1;
                     q.add(new int[]{nrow,ncol,dist[row1][col1]+1});
                }
            }
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length; 
        int vis[][]=new int[m][n];
        int dis[][]=new int[m][n];
        bfs(mat,vis,dis); 
       return dis;
    }
}