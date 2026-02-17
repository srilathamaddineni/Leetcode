class Solution {
    public void dfs(int node,List<List<Integer>> adjList,boolean visited[])
    {
        visited[node]=true;
        
        for(int j:adjList.get(node))
       {
          if(!visited[j])
          {
             dfs(j,adjList,visited);
          }
       }
        
        
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjList=new ArrayList<>();
        int v=isConnected.length;
        int cnt=0;
        boolean visited[]=new boolean[v+1];
        visited[0]=true;
        for(int i=0;i<=v;i++)
        {
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<isConnected[i].length;j++)
            {
               if(isConnected[i][j]==1 && i!=j)
               {
                  adjList.get(i+1).add(j+1);
               }
            }
        }
        for(int i=1;i<=v;i++)
        {
            if(!visited[i])
            {
                cnt++;
                dfs(i,adjList,visited);
            }
        }
     return cnt;
    }
}