class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int result[]=new int[n1];
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> nextGreater=new HashMap<>();
        for(int num:nums2)
        {
            while(!st.isEmpty() && num>st.peek())
            {
                    nextGreater.put(st.pop(),num);
            }
            st.push(num);
        }
        while(!st.isEmpty())
        {
            nextGreater.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++) 
        {
            result[i]=nextGreater.get(nums1[i]);
        }
        return result;
        
    }
}