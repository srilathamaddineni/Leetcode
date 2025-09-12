class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        if(s.length()<=1)
        {
            return s.length();
        }
        for(int i=0;i<s.length();i++)
        {
            Set<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++)
            {
                if(!set.add(s.charAt(j)))
                {
                    maxLength=Math.max(maxLength,j-i);
                    break;
                }
                maxLength=Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
}