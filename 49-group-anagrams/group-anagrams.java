class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
        //    char[] chars=str.toCharArray();
        //    Arrays.sort(chars);
        //    String key=new String(chars);
           int[] count=new int[26];
           for(char c:str.toCharArray())
           {
              count[c-'a']++;
           }
           StringBuilder sb=new StringBuilder();
           for(int num:count)
           {
            sb.append(num).append("#");
           }
           String key=sb.toString();
           if(!map.containsKey(key))
           {
              map.put(key,new ArrayList<>());
           }
           map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
        
}
}