class Node{
    int data;
    int min;
    Node(int data,int min)
    {
        this.data=data;
        this.min=min;
    }
}



class MinStack {
      Stack<Node> st;
      int minValue;
    public MinStack() {
        st=new Stack<>();
        minValue=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val<minValue)
        {
            minValue=val;
        }
        st.push(new Node(val,minValue));
    }
    
    public void pop() {
       Node result = st.pop();
        if (!st.isEmpty()) {
            minValue = st.peek().min;
        } else {
            minValue = Integer.MAX_VALUE;
        }
       
    }
    
    public int top() {
        Node result=st.peek();
        return result.data;
    }
    
    public int getMin() {
        Node result=st.peek();
        return result.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */