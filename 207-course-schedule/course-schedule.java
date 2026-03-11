class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adjList.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites)
        {
            adjList.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)queue.offer(i);
        }
        int completed=0;
        while(!queue.isEmpty())
        {
            completed++;
            int course=queue.poll();
            for(int next:adjList.get(course))
            {
                indegree[next]--;
                if(indegree[next]==0)queue.offer(next);
            } 
        }
        return completed==numCourses;
    }
}