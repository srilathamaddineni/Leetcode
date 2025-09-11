class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        
        int cnt=0;
        for(int i=0;i<s.length()-2;i++)
        {
           String substr=s.substring(i,i+3);
           Set<Character> set=new HashSet<>();
           int flag=1;
           for(int j=0;j<3;j++)
           {
              if(!set.add(substr.charAt(j)))
                 flag=0;
               
           }
           if(flag==1)
            cnt++;
        }
        return cnt;
    }
    // public isGoodString(String str)
    // {

    // }
}