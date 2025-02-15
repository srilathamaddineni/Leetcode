class Solution {

    public boolean checkBfs(List<List<Integer>> adjList,int src,int vis[])
    {
        Queue<Integer> q=new LinkedList<>();
        vis[src]=0;
        q.add(src);
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int it:adjList.get(node))
            {
                if(vis[it]==-1)
                {
                     if(vis[node]==0)
                     {
                        vis[it]=1;
                     }
                     if(vis[node]==1)
                     {
                        vis[it]=0;
                     }
                     q.add(it);
                }

                if(vis[it]==vis[node])
                {
                    return false;
                }
                
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] grid) {
        int m=grid.length;
        int vis[]=new int[m];
        Arrays.fill(vis,-1);
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            adjList.add(new ArrayList<>());
            for(int j=0;j<grid[i].length;j++)
            {
                adjList.get(i).add(grid[i][j]);
            }
        }
       for (int i = 0; i < m; i++) {
            if (vis[i] == -1) { // If unvisited, check bipartiteness
                if (!checkBfs(adjList, i, vis)) {
                    return false;
                }
            }
        }
        return true;

    }
}