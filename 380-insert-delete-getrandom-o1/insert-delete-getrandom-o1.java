class RandomizedSet {
     private List<Integer> li;
     private Map<Integer,Integer> map;
    public RandomizedSet() {
       li=new ArrayList<>();
       map=new HashMap<>();
    }
    public boolean search(int val)
    {
        return map.containsKey(val);
    }
    
    public boolean insert(int val) {
       if(search(val))return false;
       li.add(val);
       map.put(val,li.size()-1);
       return true;

    }
    
    public boolean remove(int val) {
        if(!search(val))return false;
        int index=map.get(val);
        li.set(index,li.get(li.size()-1));
        map.put(li.get(index),index);
        li.remove(li.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
    Random rand = new Random();
    return li.get(rand.nextInt(li.size()));
}

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */