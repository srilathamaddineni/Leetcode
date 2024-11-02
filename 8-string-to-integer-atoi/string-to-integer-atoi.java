class Solution {
    public int myAtoi(String s) {
        String integer=" ";
        int pos=0;
        int sign=1;
        int n=s.length();
        while(pos<n && s.charAt(pos)==' ')
        {
            pos++;
        }
        if(pos>=n)
        {
            return 0;
        }
        if(s.charAt(pos)=='-' )
        {
           sign=-1;
        }
         if(s.charAt(pos)=='-' || s.charAt(pos)=='+' )
        {
           pos++;
        }
        if(pos>=n)
          return 0;
        int num=0;
        while(pos<n && s.charAt(pos)>='0' && s.charAt(pos)<='9')
        {
            int x=s.charAt(pos)-'0';
            if (num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && x>Integer.MAX_VALUE%10)) {
                if (sign==1) {
                    return Integer.MAX_VALUE;
                }
                else {
                    return Integer.MIN_VALUE;
                }
            }
            num=num*10+x;
            pos++;
        }
        
        return num*sign;
        
    }
}