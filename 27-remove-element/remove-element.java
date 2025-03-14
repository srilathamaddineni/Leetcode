class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                li.add(nums[i]);
            }
           
        }
        for(int i=0;i<li.size();i++)
        {
            nums[i]=li.get(i);
        }
        System.out.println(n);
        return li.size();
    }
}