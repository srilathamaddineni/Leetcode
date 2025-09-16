class Solution {
    public int characterReplacement(String s, int k) {
        // int n=s.length();
        // int maxLength=0;
        // for(int i=0;i<n;i++)
        // {
        //     int freq[]=new int[26];
        //     int maxOccur=0;
        //     int cont=1;
        //     if(n-i<maxLength)
        //     {
        //         break;
        //     }
        //     for(int j=i;j<n;j++)
        //     {
        //        freq[s.charAt(j)-'A']++; //freq[0]=1,freq[0]=2
        //        maxOccur=Math.max(maxOccur,freq[s.charAt(j)-'A']);//maxOccur=1,2;
        //        int currentLength = j - i + 1;
        //        if (currentLength - maxOccur <= k) {
        //             // Update the maximum length found so far
        //             maxLength = Math.max(maxLength, currentLength);
        //         }
        //         else
        //         {
        //             break;
        //         }
        //     }
        // }
        // return maxLength;
        int n=s.length();
        int l=0;
        int maxLength=0;
        int maxFreq=0;
        int freq[]=new int[26];
        for(int r=0;r<s.length();r++)
        {
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            int currLength=r-l+1;
            while(currLength-maxFreq>k)
            {
                freq[s.charAt(l)-'A']--;
                maxFreq=Math.max(freq[s.charAt(l)-'A'],maxFreq);
                l++;
                maxLength=Math.max(maxLength,r-l+1);
                currLength=r-l+1;
            }
            maxLength=Math.max(maxLength,r-l+1);
            
        }
        return maxLength;
    }
}