class StockSpanner {
    List<Integer> arr;
    public StockSpanner() {
         arr=new ArrayList<>();
    }
    
    public int next(int price) {
        int cnt=0;
        int max=1;
        arr.add(price);
        int n=arr.size();
        for(int i=n-1;i>=0;i--)
        {
            if(arr.get(i)<=price)
            {
               cnt++;    
               max=Math.max(cnt,max);
            }
            else
            {
               break;
            }
           
        }
       
     return max;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */