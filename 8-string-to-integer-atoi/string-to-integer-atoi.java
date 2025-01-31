class Solution {
    public int myAtoi(String s) {
        boolean negative=false;
        String modifiedString="";
        int n=s.length();
        int result=0;
        int i=0;
        while(i<n && s.charAt(i)==' ')
        {
          i++;
        }
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            negative = (s.charAt(i) == '-');
            i++;
        }
        while(i<n && (int)s.charAt(i)-'0'>=0 && (int)s.charAt(i)-'0'<=9 )
        {
            
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && (int)(s.charAt(i)-'0')>Integer.MAX_VALUE%10))
            {
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            result*=10;
            result+=((int)s.charAt(i)-'0');
            i++;
        }
        
        return negative?-result:result;


        
        
    }
}