class Solution {
    public int[] decrypt(int[] code, int k) {
        int res[]=new int[code.length];
        int n=code.length;
        for(int i=0;i<code.length;i++)
        {
            if(k==0)
            {
                 res[i]=0;
            }
            else if(k>0)
            {
                int sum=0;
                for(int j=1;j<=Math.abs(k);j++)
                {
                    sum+=code[(i+j)%n];
                }
                res[i]=sum;
            }
            else
            {
                int sum=0;
                for(int j=1;j<=Math.abs(k);j++)
                {
                    sum+=code[(n+i-j)%n];//code[3]+code[2],code[2]+code[]

                }
                res[i]=sum;
            }
        }
        return res;
    }
}