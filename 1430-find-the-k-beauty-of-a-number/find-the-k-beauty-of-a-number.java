class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int cnt=0;
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub=s.substring(i,i+k);
            int kBeauty=Integer.parseInt(sub);
            if(kBeauty!=0)
            {
            if(num%kBeauty==0)
            {
                cnt++;
            }
            }
        }
        return cnt;
    }
}