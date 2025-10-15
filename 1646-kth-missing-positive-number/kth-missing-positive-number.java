class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int left=0, right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if((arr[mid]-(mid+1))>=k)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        
        return left+k;
    }

    /*reason behind left+k
    missing number=arr[high]-(high+1);

    */

}