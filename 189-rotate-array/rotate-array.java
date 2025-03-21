class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int rotatedArr[]=new int[n];
        if(k>n)
        {
            k=(k-n)%n;
        }
        for(int i=0;i<nums.length;i++)
        {
            rotatedArr[i]=nums[(n+i-k)%n];
        } 
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=rotatedArr[i];
        }
    }
}