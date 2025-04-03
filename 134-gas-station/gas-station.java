class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int start_index=0;
        int total_gas=0;
        int total_cost=0;
        int currentGas=0;
        for(int i=0;i<n;i++)
        {
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_cost>total_gas)
        {
            return -1;
        }
        for(int i=0;i<n;i++)
        {
            currentGas+=gas[i]-cost[i];
            if(currentGas<0)
            {
                currentGas=0;
                start_index=i+1;
            }
        }
        return start_index;
       

        
    }
}