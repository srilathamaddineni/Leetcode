class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0;
        Set<Character> charSet=new HashSet<>();
        if(s.length()<=1)
          return s.length();
        for(int right=0;right<s.length();right++)
        {
          char currentChar=s.charAt(right);  
           while(charSet.contains(currentChar))
           {
             charSet.remove(s.charAt(left));
             left++;
           }
           charSet.add(currentChar);
           
           max=Math.max(right-left+1,max);      
         }        
        return max;
    }
}