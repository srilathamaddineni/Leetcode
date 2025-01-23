class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        {
            return s;
        }
        String maxStr=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++)
        {
            String odd=expandAround(s,i,i);
            String even=expandAround(s,i,i+1);
            if(maxStr.length()<odd.length() || maxStr.length()<even.length())
            {
            if(odd.length()>even.length())
            {
                maxStr=odd;
            }
            if(odd.length()<even.length())
            {
                maxStr=even;
            }
            }
        }
       return maxStr;
    }
    public String expandAround(String s, int left, int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}