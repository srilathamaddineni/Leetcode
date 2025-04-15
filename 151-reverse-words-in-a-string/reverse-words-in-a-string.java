class Solution {
    public String reverseWords(String s) {
      int start=0;
      int end=s.length()-1;
      StringBuilder reversedStr=new StringBuilder("");

      while(s.charAt(start)==' ')
      {
         start++;
      } 
      while(s.charAt(end)==' ')
      {
        end--;
      } 
      for(int i=end;i>=start;i--)
      {
        String word="";
         while(s.charAt(i)!=' ' && i>=start)
         {
            word=s.charAt(i)+word;
            if(i==start)
            {
                break;
            }
             i--; 
         }
        if(i!=start)
        {
          if(s.charAt(i+1)!=' ')
          word=word+" ";
        }
         reversedStr.append(word);
      }   
     return reversedStr.toString();
    }
}