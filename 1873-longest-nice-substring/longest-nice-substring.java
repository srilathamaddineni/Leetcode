class Solution {
    public String longestNiceSubstring(String s) {
    //    String longest="";
    //     int n=s.length();
    //     for(int i=0;i<n-1;i++)
    //     {
    //         for(int j=i+1;j<=n;j++)
    //         {
    //             String sub=s.substring(i,j);
    //             if(isNice(sub) && longest.length()<sub.length())
    //             {
    //                 longest=sub;
    //             }
    //         }
    //     }
    //     return longest;
    
    // }
    // private boolean isNice(String s)
    // {
    //     Set<Character> set=new HashSet<>();
    //     for(char c:s.toCharArray())
    //     {
    //         set.add(c);
    //     }
    //     for(char c:set)
    //     {
    //         if(Character.isUpperCase(c) && !set.contains(Character.toLowerCase(c)))
    //             return false;
    //         if(Character.isLowerCase(c) && !set.contains(Character.toUpperCase(c)))
    //             return false;
            
    //     }
    //     return true;
    if(s.length()<2)
      return "";
    return findNiceString(s,0,s.length());
    }
    private String findNiceString(String s, int l,int r)
    {
        if(r-l<2)
          return "";
        Set<Character> set=new HashSet<>();
        for(int i=l;i<r;i++)
        {
            set.add(s.charAt(i));
        }
        for(int i=l;i<r;i++)
        {
            char letter=s.charAt(i);
            if(!set.contains(Character.toUpperCase(letter)) || !set.contains(Character.toLowerCase(letter)))
            {
                String left=findNiceString(s,l,i);
                String right=findNiceString(s,i+1,r);
                return left.length()>=right.length()?left:right;
            }
        }
        return s.substring(l,r);
    }
}