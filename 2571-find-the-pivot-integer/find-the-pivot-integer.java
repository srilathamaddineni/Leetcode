class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        for(int i=1;i<=n;i++)
        {
            int prefixSum=i*(i+1)/2;
            int suffixSum=sum-prefixSum+i;
            if(prefixSum==suffixSum)
              return i;
        }
       
        return -1;
    }
}