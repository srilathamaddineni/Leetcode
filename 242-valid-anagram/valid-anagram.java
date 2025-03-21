class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))!=0)
            {
                return false;
            }
        }
        return true;
    }
}