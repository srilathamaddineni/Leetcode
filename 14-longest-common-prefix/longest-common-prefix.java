class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        /*Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
        String longest=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            for(int j=0;j<longest.length();j++)
            {
                if(strs[i].charAt(j)!=(longest.charAt(j)))
                {
                    longest=longest.substring(0,j);
                    break;
                }
            }
        }

        return longest;*/
        //Sorting based on the characters
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}