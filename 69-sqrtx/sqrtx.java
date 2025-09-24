class Solution {
    public int mySqrt(int x) {
    //  if(x==0 || x==1)
    //  {
    //     return x;
    //  }
    //   long i=1;
    //   while(i<=x/2)
    //   {
    //     if(i*i==x)
    //     {
    //         return (int)i;
    //     }
    //     if(i*i>x)
    //      break;
    //     i++;
    //   }
    //   return (int)i-1;
    if(x==0 || x==1)
    {
        return x;
    }
    long low=1;
    long high=x/2;
    long result=0;
    while(low<=high)
    {
        long mid=(int)(low+(high-low)/2);
        if(mid*mid==x)
        {
            return (int)mid;
        }
        else if(mid*mid<x)
        {
            result=mid;
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
     return (int)result;

    }
}