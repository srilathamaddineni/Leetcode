class Solution {
   public void dfs(int i,List<List<Integer>> adjList,boolean[] vis)
   {
       vis[i]=true;
       for(int j:adjList.get(i))
       {
          if(!vis[j])
          {
             dfs(j,adjList,vis);
          }
       }

   }


    public int findCircleNum(int[][] isConnected) {
         List<List<Integer>> adjList=new ArrayList<>();
         int v=isConnected.length;
         int cnt=0;
         boolean vis[]=new boolean[v+1];
         vis[0]=true;
         for(int i=0;i<=v;i++)
         {
            adjList.add(new ArrayList<>());
         }
         for(int i=0;i<v;i++ )
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
            if(!vis[i])
            {
                cnt++;
                dfs(i,adjList,vis);
            }
         }
         return cnt;
    }
}