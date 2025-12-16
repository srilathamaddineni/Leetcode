class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2)
        {
            return s;
        }
        int start=0, end=0;
        String result="";
        
        for(int i=0;i<n;i++)
        {
           int len1=expand(s,i,i);
           int len2=expand(s,i,i+1);
           int len=Math.max(len1,len2);
           if(len>=end-start+1)
           {
              start=i-(len-1)/2;
              end=i+(len/2);
              result=s.substring(start,end+1);
           }


        }
        return result;
    }
    public int expand(String s, int left,int right)
    {   int n=s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}