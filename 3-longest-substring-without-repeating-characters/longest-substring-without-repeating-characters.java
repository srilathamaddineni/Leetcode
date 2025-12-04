class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0, right=0;
        int maxLength=0;
        Set<Character> set=new HashSet<>();
        while(right<n)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(right-left+1,maxLength);
            right++;
        }
        return maxLength;
    }
}