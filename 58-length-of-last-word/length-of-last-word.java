class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        int n=s.length();
        int index=n-1;
        while(s.charAt(index)==' ')
        {
            index--;
        }
        for(int i=index;i>=0;i--)
        {
            
             if(s.charAt(i)==' ')
             {
                break;
             }
             else
             {
                  cnt++;
             }
        }
        return cnt;
    }
}