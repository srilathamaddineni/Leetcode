class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] sortedArray=strs[i].toCharArray();
            Arrays.sort(sortedArray);
            String sorted=new String(sortedArray);
            map.computeIfAbsent(sorted,k->new ArrayList<>()).add(strs[i]);
        }
        result.addAll(map.values());
        return result;
    }
}