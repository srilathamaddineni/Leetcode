class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        {
            return "";
        }
        String longCommonPrefix=strs[0];
       // Arrays.sort(strs,(a,b)->Integer.compare(a.length(), b.length()));//nlogn
        for(int i=0;i<longCommonPrefix.length();i++) //kn
        {
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i))
                {
                   return longCommonPrefix.substring(0,i);
                }
            }
            
        }
        return longCommonPrefix;       
    }
}