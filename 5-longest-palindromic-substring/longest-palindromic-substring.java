class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        String maxString = s.charAt(0) + "";
        if(s.length()<2)
        {
            return s;
        }
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub))
                {
                    if(sub.length()>max)
                    {
                      maxString=sub;
                      max=sub.length();
                    }
                }
            }
        }
        return maxString;      
    }
    public boolean isPalindrome(String s)
    {
        int right=s.length()-1;
        int left=0;
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                 return false;
            }
            left++;
            right--;
        }
        return true;

    }
}