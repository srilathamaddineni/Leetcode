class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> frequency=new HashMap<>();
        for(char c:s.toCharArray())
        {
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->frequency.get(b)-frequency.get(a));
        maxHeap.addAll(frequency.keySet());
        StringBuilder result=new StringBuilder();
        while(maxHeap.size()>=2)
        {
            char char1=maxHeap.poll();
            char char2=maxHeap.poll();
            result.append(char1);
            result.append(char2);
            frequency.put(char1,frequency.get(char1)-1);
            frequency.put(char2,frequency.get(char2)-1);
            if(frequency.get(char1)>0)maxHeap.add(char1);
            if(frequency.get(char2)>0)maxHeap.add(char2);
            
        }
        if(!maxHeap.isEmpty())
        {
            char ch=maxHeap.poll();
            if(frequency.get(ch)>1)return "";
            result.append(ch);
        }
        return result.toString();
        
    }
}