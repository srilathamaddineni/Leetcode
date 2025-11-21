class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int prev_less[]=new int[n];
        int next_less[]=new int[n];
        int prev_great[]=new int[n];
        int next_great[]=new int[n];
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && nums[st.peek()]>nums[i])
            {
                st.pop();
            }
            prev_less[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])
            {
                st.pop();
            }
            next_less[i]=(st.isEmpty())?n:st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            while(!st2.isEmpty() && nums[st2.peek()]<=nums[i])
            {
                st2.pop();
            }
            prev_great[i]=(st2.isEmpty())?-1:st2.peek();
            st2.push(i);
        }
        st2.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st2.isEmpty() && nums[st2.peek()]<nums[i])
            {
                st2.pop();
            }
            next_great[i]=(st2.isEmpty())?n:st2.peek();
            st2.push(i);
        }
        long minSum=0, maxSum=0;
        long result=0; 
        for(int i=0;i<n;i++)
        {
           long leftMin = i - prev_less[i];
           long rightMin = next_less[i] - i;
            minSum += leftMin * rightMin * nums[i];

            long leftMax = i - prev_great[i];
            long rightMax = next_great[i] - i;
            maxSum += leftMax * rightMax * nums[i];
        }
        return maxSum-minSum;
    }
}