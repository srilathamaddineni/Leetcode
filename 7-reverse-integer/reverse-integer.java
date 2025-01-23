class Solution {
    public int reverse(int x) {
      int flag=1;
       if(x<0)
       {
          flag=-1;
          x=-x;
       }
       int reversed=0;
       while(x>0)
       {
          int rem=x%10;
          x=x/10;
             
          if(reversed>(Integer.MAX_VALUE-rem)/10)
        {
            return 0;
        }
        reversed=reversed*10+rem;
       }
       
       return flag*reversed;
    }
}