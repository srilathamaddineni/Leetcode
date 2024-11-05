class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Brute force
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}