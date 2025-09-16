class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLength=0;
        for(int i=0;i<n;i++)
        {
            int freq[]=new int[26];
            int maxOccur=0;
            int cont=1;
            if(n-i<maxLength)
            {
                break;
            }
            for(int j=i;j<n;j++)
            {
               freq[s.charAt(j)-'A']++; //freq[0]=1,freq[0]=2
               maxOccur=Math.max(maxOccur,freq[s.charAt(j)-'A']);//maxOccur=1,2;
               int currentLength = j - i + 1;
               if (currentLength - maxOccur <= k) {
                    // Update the maximum length found so far
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        return maxLength;
    }
}