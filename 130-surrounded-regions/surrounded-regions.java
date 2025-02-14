class Solution {
    public void dfs(int i,int j,int vis[][],char board[][])
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O' || vis[i][j]==1)
        {
            return;
        }
        vis[i][j]=1;
        dfs(i+1,j,vis,board);
        dfs(i-1,j,vis,board);
        dfs(i,j+1,vis,board);
        dfs(i,j-1,vis,board);
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            dfs(i,0,vis,board);
            dfs(i,n-1,vis,board);
        }
        for(int j=0;j<n;j++)
        {
            dfs(0,j,vis,board);
            dfs(m-1,j,vis,board);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O' && vis[i][j]==0)
                {
                    board[i][j]='X';
                }
            }
        }
    }
}