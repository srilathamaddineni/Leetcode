class Solution {
    public int orangesRotting(int[][] grid) {
         int minutes=0;
         int n=grid.length;
         int m=grid[0].length;
         if(n==0)
           return 0;
         Queue<int[]> q=new LinkedList<>();
         int cnt=0;
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)cnt++;
            }
         }
         if(cnt==0)return 0;
         int drow[]={1,0,-1,0};
         int dcol[]={0,-1,0,1};
         while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int x = cell[0], y = cell[1];

                for (int j = 0; j < 4; j++) {
                    int row = x + drow[j];
                    int col = y + dcol[j];

                    if (row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == 1) {
                        grid[row][col] = 2;
                        q.offer(new int[]{row, col});
                        cnt--;
                        rotted = true;
                    }
                }
            }

            if (rotted) minutes++; // Only increment time if at least one orange was rotted
        }
       return cnt>0?-1:minutes;

    }
}