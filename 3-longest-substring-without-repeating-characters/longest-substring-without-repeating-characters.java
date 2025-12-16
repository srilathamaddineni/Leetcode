class Solution {
    public int lengthOfLongestSubstring(String s) {
         int start=0;
         int maxLength=0;
         Set<Character> set=new HashSet<>();
         for(int i=0;i<s.length();i++)
         {
            if(set.contains(s.charAt(i)))
            {
            while(!set.isEmpty() && set.contains(s.charAt(i)) && start<i) 
            {
                set.remove(s.charAt(start));
                start++;
            }
            }
            set.add(s.charAt(i));
            if(set.size()>maxLength)
            {
                System.out.println(s.substring(start,i));
            }
            maxLength=Math.max(maxLength, set.size());

         }
         return maxLength;
    }
}