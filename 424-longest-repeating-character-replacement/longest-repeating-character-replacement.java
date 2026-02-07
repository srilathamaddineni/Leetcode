class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0;
        int n=s.length();
        int left=0;
        int maxFreq=0;
        int[] freq=new int[26];
        for(int right=0;right<n;right++)
        {
           int index=s.charAt(right)-'A';
           int winLen=right-left+1;
           freq[index]++;
           maxFreq=Math.max(maxFreq,freq[index]);
           int replacementsNeeded=winLen-maxFreq;
           while(replacementsNeeded>k)
           {
              freq[s.charAt(left)-'A']--;
              left++;
              winLen = right - left + 1;
              replacementsNeeded = winLen - maxFreq;
           }
           maxLen=Math.max(maxLen,right-left+1);
            
        }
        return maxLen;


    }
}