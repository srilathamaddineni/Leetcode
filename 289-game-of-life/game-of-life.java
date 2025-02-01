class Solution {
    public void gameOfLife(int[][] board) {
        //Brute Force
        int n=board.length;
        int m=board[0].length;
        int arr[][]=new int[n][m];
        int[] dx = {-1, -1, -1,  0, 0, 1, 1, 1};
        int[] dy = {-1,  0,  1, -1, 1,-1, 0, 1};
         if (board == null || board.length == 0) {
            return;
        }
        
       /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=board[i][j];
            }
        }*/
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int cnt=0;
                int ni,nj;
                for(int k=0;k<8;k++)
                {
                    ni=i+dx[k];
                    nj=j+dy[k];
                    if(ni>=0 && ni<n && nj>=0 && nj<m && (board[ni][nj]==1 || board[ni][nj]==-1))
                    {
                        cnt++;
                    }
                }
                if(board[i][j]==1)
                {
                    if(cnt<2  || cnt>3  )
                    {
                        board[i][j]=-1;
                    }
                }
                else
                {
                    if(cnt==3)
                    {
                        board[i][j]=-2;
                    }
                }
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==-1)
                {
                    board[i][j]=0;
                }
                if(board[i][j]==-2)
                {
                    board[i][j]=1;
                }
            }
        }
    }
}