class Solution {
    public String reverseWords(String s) {
      if(s==null || s.isEmpty())
      {
        return s;
      }
      int start=0;
      int end=s.length()-1;
      StringBuilder reversedStr=new StringBuilder();

      while(s.charAt(start)==' ')
      {
         start++;
      } 
      while(s.charAt(end)==' ')
      {
        end--;
      } 
     while(end>=start)
      {
        String word="";
         while(end>=start && s.charAt(end)!=' ')
         {
            word=s.charAt(end)+word;
            end--; 
         }
        if (reversedStr.length() > 0 && s.charAt(end+1)!=' ') {
                reversedStr.append(" ");
            }
         reversedStr.append(word);
         end--;
      }   
     return reversedStr.toString();
    }
}