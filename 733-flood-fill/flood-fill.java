class Pair{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public void bfs(int[][] image,int sr,int sc,int color)
    {
            Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(sr,sc));
            int originalColor=image[sr][sc];
            image[sr][sc]=color;
            int dx[]={0,1,0,-1};
            int dy[]={1,0,-1,0};
            while(!q.isEmpty())
            {
               int row=q.peek().first;
               int col=q.peek().second;
               q.remove();
               for(int i=0;i<4;i++)
               {
                  int nrow=row+dx[i];
                  int ncol=col+dy[i];
                  if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol]==originalColor)
                  {
                    image[nrow][ncol]=color;
                    q.add(new Pair(nrow,ncol));
                  }
               }
            }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor=image[sr][sc];
        if(originalColor==color)
          return image;
        bfs(image,sr,sc,color);
        return image;
    }
}