class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        int cnt=0;
       while(l<g.length && r<s.length)
       {
          if(s[r]>=g[l])
          {
            l++;
            cnt++;
          }
          r++;
       }
       return l;
    }
}