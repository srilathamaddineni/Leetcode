class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                if(i==0)
                {
                    left[i]=1;
                }
                else
                {
                    left[i]=left[i-1]+1;
                }
                
            }
            else
            {
                if(i!=0)
                {
                 left[i]=left[i-1];
                }
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
               if(i==n-1)
               {
                  right[i]=1;
               }
               else
               {
                 right[i]=right[i+1]+1;
               }
            }
            else
            {
                if(i!=n-1)
                {
                  right[i]=right[i+1];
                }
            }
            
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            max=Math.max(left[i]+right[i+1],max);
        }
     return max;
    }
}