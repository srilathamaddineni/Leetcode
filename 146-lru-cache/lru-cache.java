class Node{
    int key;
    int val;
    Node next;
    Node prev;

    public Node(int key,int val)
    {
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}


class LRUCache {
    int cap;
    Map<Integer,Node> cache;
    Node oldest;
    Node latest;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.cache=new HashMap<>();
        this.oldest=new Node(0,0);
        this.latest=new Node(0,0);
        this.oldest.next=latest;
        this.latest.prev=oldest;
    }
    public void remove(Node node)
    {
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    public void insert(Node node)
    {
        Node prev=latest.prev;
        Node next=latest;
        prev.next=node;
        next.prev=node;
        node.next=next;
        node.prev=prev;

    }
    public int get(int key) {
        if(cache.containsKey(key))
        {
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
        {
            remove(cache.get(key));
        }
        Node newNode=new Node(key,value);
        cache.put(key,newNode);
        insert(newNode);
        if(cache.size()>cap)
        {
            Node lru=oldest.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */