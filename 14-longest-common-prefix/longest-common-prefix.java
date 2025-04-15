class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
        {
            return strs[0];
        }
        String longCommonPrefix="";
        int strsLength=strs.length;
        Arrays.sort(strs,(a,b)->Integer.compare(a.length(), b.length()));
        for(int i=0;i<strs[0].length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                if(strs[0].charAt(i)!=strs[j].charAt(i))
                {
                   return longCommonPrefix;
                }
            }
            longCommonPrefix+=strs[0].charAt(i);
        }
        return longCommonPrefix;
        
    }
}