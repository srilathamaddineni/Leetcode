class MyCircularDeque {
     Queue<Integer> q1;
     Queue<Integer> q2;
     private int capacity=0;
    public MyCircularDeque(int k) {
        this.capacity=k;
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public boolean insertFront(int value) {
        if(isFull())
        {
            return false;
        }
        if(q1.isEmpty())
        {
            q1.add(value);
            return true;
        }
        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }
        q1.add(value);
        while(!q2.isEmpty())
        {
            q1.add(q2.poll());
        }
      return true;
    }
    
    public boolean insertLast(int value) {
       if(isFull())
        {
            return false;
        }
        q1.add(value);
        return true;
    }
    
    public boolean deleteFront() {
       if(q1.isEmpty())
       {
        return false;
       }
       q1.remove();
       return true;
    }
    
    public boolean deleteLast() {
        if(q1.isEmpty())
        {
            return false;
        }
        while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        q1.remove();
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
        return true;
    }
    
    public int getFront() {
        if(q1.isEmpty())
        {
            return -1;
        }
        return q1.peek();
    }
    
    public int getRear() {
        if(q1.isEmpty())
        {
            return -1;
        }
        int val=0;
         while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        val=q1.peek();
        q2.add(q1.remove());
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
        return val;
    }
    
    public boolean isEmpty() {
        return q1.isEmpty();
    }
    
    public boolean isFull() {
        if(q1.size()==capacity)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */