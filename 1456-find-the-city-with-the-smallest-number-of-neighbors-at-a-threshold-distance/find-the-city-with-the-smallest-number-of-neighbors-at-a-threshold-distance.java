class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                  dist[i][j]=(int)1e8;
                }
                else
                {
                    dist[i][j]=0;
                }
              
            }
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            dist[u][v]=w;
            dist[v][u]=w;
        }
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
        int minNeighbours=Integer.MAX_VALUE;
        int cityWithMinNeighbours=-1;
        for(int i=0;i<n;i++)
        {
            int noOfNeighbours=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && dist[i][j]<=distanceThreshold)
                {
                   noOfNeighbours++;
                }
            }
                if(noOfNeighbours<=minNeighbours)
            {
                cityWithMinNeighbours=i;
                minNeighbours=noOfNeighbours;
            }
           
        }
        return cityWithMinNeighbours;
    }
}