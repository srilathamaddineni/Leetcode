class Solution {
    public int maxScore(String s) {
    //     int n=s.length();
    //     int left[]=new int[n];
    //     int right[]=new int[n];
    //     left[0]=s.charAt(0)=='0'?1:0;
    //     right[n-1]=s.charAt(n-1)=='1'?1:0;
    //     for(int i=1;i<n;i++)
    //     {
    //         left[i]=s.charAt(i)=='0'?left[i-1]+1:left[i-1];
    //     }
    //     for(int i=n-2;i>=0;i--)
    //     {
    //         right[i]=s.charAt(i)=='1'?right[i+1]+1:right[i+1];
    //     }
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<n-1;i++)
    //     {
    //         max=Math.max(left[i]+right[i+1],max);
    //     }
    //  return max;
    //Optimized Approach
     int totalOnes=0;
     for(int i=0;i<s.length();i++)
     {
        if(s.charAt(i)=='1')
        {
            totalOnes++;
        }
     }
     int maxScore=Integer.MIN_VALUE;
     int zeroes=0;
     int ones=totalOnes;
     for(int i=0;i<s.length()-1;i++)
     {
        if(s.charAt(i)=='0')zeroes++;
        else ones--;
        maxScore=Math.max(maxScore,zeroes+ones);
     }
     return maxScore;

    }
}