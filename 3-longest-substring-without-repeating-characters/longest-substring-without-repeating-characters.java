class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int lengthOfLongestSubstr=0;
       for(int right=0;right<s.length();right++)
        {
            char letter=s.charAt(right);
            while(set.contains(s.charAt(right)))
            {
               set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            lengthOfLongestSubstr=Math.max(lengthOfLongestSubstr,right-left+1);
        }
        return lengthOfLongestSubstr;

    }
}