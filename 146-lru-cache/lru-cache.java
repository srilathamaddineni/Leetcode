

class LRUCache {
    class Node{
         int key,value;
         Node next,prev;
         Node(int k,int v)
         {
            this.key=k;
            this.value=v;
         }
    }
    private void addNode(Node node)
    {
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    private void removeNode(Node node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private Node head,tail;
    private int capacity;
    private Map<Integer,Node> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))return -1;

        Node node=map.get(key);
        removeNode(node);
        addNode(node);
        return node.value;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            node.value=value;
            removeNode(node);
            addNode(node);
        }
        else
        {
            if(map.size()==capacity)
            {
                Node lru=tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
            Node node=new Node(key,value);
            map.put(key,node);
            addNode(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */