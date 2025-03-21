class Solution {
    public void rotate(int[] nums, int k) {
        // int n=nums.length;
        // // int rotatedArr[]=new int[n];
        // if(k>n)
        // {
        //     k=(k-n)%n;
        // }
        // // for(int i=0;i<nums.length;i++)
        // // {
        // //     rotatedArr[i]=nums[(n+i-k)%n];
        // // } 
        // // for(int i=0;i<nums.length;i++)
        // // {
        // //     nums[i]=rotatedArr[i];
        // // }
        //In-Place
        int n=nums.length;
        k=k%n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
       
    }
    public void reverse(int arr[],int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}