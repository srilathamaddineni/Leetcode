class Solution {
    public int mySqrt(int x) {
     if(x==0 || x==1)
     {
        return x;
     }
      long i=1;
      while(i<=x/2)
      {
        if(i*i==x)
        {
            return (int)i;
        }
        if(i*i>x)
         break;
        i++;
      }
      return (int)i-1;

    }
}