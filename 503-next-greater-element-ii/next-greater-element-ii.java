class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int results[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {  
            int j=(i + 1) % n ;
            int counter=0;
            results[i]=-1;
            while(counter<n)
            {
               
                if(nums[j]>nums[i])
                {
                    results[i]=nums[j];
                    break;
                }
                j=(j+1)%n;
                counter++;
            }
            
        }
        return results;
    }
}