class Solution {
    public String minWindow(String s, String t) {
       if(s.length()<t.length())
       {
        return "";
       }
       int[] need=new int[128];
       for(char c:t.toCharArray())need[c]++;
       int required=0;
       for(int i=0;i<128;i++){
        if(need[i]>0)required++;
       }
       int[] window=new int[128];
       int left=0;
       int bestLen=Integer.MAX_VALUE;
       int bestStart=0;
       int formed=0;
       for(int right=0;right<s.length();right++)
       {
          char c=s.charAt(right);
          window[c]++;
          if(need[c]>0 && window[c]==need[c])
          {
             formed++;
          }
          while(formed==required)
          {
             int len=right-left+1;
             if(len<bestLen)
             {
                bestStart=left;
                bestLen=len;
             }
             char lc=s.charAt(left);
             window[lc]--;
             if(need[lc]>0 && window[lc]<need[lc])
             {
                formed--;
             }
             left++;
          }
       }
      return bestLen==Integer.MAX_VALUE?"":s.substring(bestStart,bestStart+bestLen);
    }
}