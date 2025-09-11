class Solution {
    public int[] decrypt(int[] code, int k) {
        // int res[]=new int[code.length];
        // int n=code.length;
        // for(int i=0;i<code.length;i++)
        // {
        //     if(k==0)
        //     {
        //          res[i]=0;
        //     }
        //     else if(k>0)
        //     {
        //         int sum=0;
        //         for(int j=1;j<=Math.abs(k);j++)
        //         {
        //             sum+=code[(i+j)%n];
        //         }
        //         res[i]=sum;
        //     }
        //     else
        //     {
        //         int sum=0;
        //         for(int j=1;j<=Math.abs(k);j++)
        //         {
        //             sum+=code[(n+i-j)%n];

        //         }
        //         res[i]=sum;
        //     }
        // }
        // return res;
        int n=code.length;
        int res[]=new int[n];
        if(k==0)
        {
            return res;
        }
        int start=(k>0)?1:n+k;
        int end=(k>0)?k:n-1;
        int wsum=0;
        for(int i=start;i<=end;i++)
        {
            wsum+=code[i%n];
        }
        for(int i=0;i<n;i++)
        {
            res[i]=wsum;
            wsum+=code[(end+i+1)%n];
            wsum-=code[(start+i)%n];
        }
        return res;

    }
}