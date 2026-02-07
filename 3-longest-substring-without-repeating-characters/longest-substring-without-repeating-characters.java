class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
        {
            return s.length();
        }
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int i=0;i<s.length();i++)
        {
                 while(!set.add(s.charAt(i)))
                 {
                    set.remove(s.charAt(left++));
                 }
                 set.add(s.charAt(i));
              maxLength=Math.max(set.size(),maxLength);
        }
        return maxLength;
    }
}