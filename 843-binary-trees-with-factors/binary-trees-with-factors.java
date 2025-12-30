class Solution {
    private static final long MOD=1_000_000_007L;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        long[] dp=new long[n];
        Map<Integer,Integer> index=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            index.put(arr[i],i);
        }
        for(int i=0;i<n;i++)
        {
            long ways=1;
            int x=arr[i];
            for(int j=0;j<i;j++)
            {
                int a=arr[j];
                if(x%a!=0)continue;
                 int b=x/a;
                 Integer k=index.get(b);
                 if(k==null)continue;
                 ways=(ways+(dp[j]*dp[k])%MOD)%MOD;
            }
            dp[i]=ways;
        }
        long ans = 0;
        for (long v : dp) {
            ans = (ans + v) % MOD;
        }
        return (int) ans;

    }
}