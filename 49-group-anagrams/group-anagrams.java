class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       /* List<List<String>> ans=new ArrayList<>();
        List<String> li=new ArrayList<>();
        li.add(strs[0]);
        ans.add(li);
        for(int i=1;i<strs.length;i++)
        { 
            int flag=0;
            for(int j=0;j<ans.size();j++)
            {
                char[] arr1=strs[i].toCharArray();
                char[] arr2=ans.get(j).get(0).toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2))
                {
                    ans.get(j).add(strs[i]);
                    flag=1;
                }
            }
          if(flag==0)
          {
             List<String> temp=new ArrayList<>();
             temp.add(strs[i]);
             ans.add(temp);
          }
        }
        return ans;*/
        Map<String,List<String>> sortMapping=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char sortedArray[]=strs[i].toCharArray();
            Arrays.sort(sortedArray);
            String sorted=new String(sortedArray);
            sortMapping.computeIfAbsent(sorted,k->new ArrayList<>()).add(strs[i]);
        }
        ans.addAll(sortMapping.values());
        return ans;
      
    }
}