class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int prev_less[]=new int[n];
        int next_less[]=new int[n];
        Stack<Integer> st=new Stack<>();
        long MOD = 1_000_000_007L;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            prev_less[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            next_less[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        long result=0;

        for(int i=0;i<n;i++)
        {
            long left=i-prev_less[i];
            long right=next_less[i]-i;
            result = (result + ((left * right) % MOD) * arr[i] % MOD) % MOD;

        }
        return (int)result;
    }
}