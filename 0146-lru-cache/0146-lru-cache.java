class DLL{
    public int key;
    public int value;
    public DLL prev;
    public DLL next;

    public DLL(int key, int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    int capacity = 0;
    Map<Integer,DLL> map = null;
    DLL head,tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new DLL(0,0);
        tail = new DLL(0,0);
        head.next = tail;
        tail.prev = head; 
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            DLL node = new DLL(map.get(key).key,map.get(key).value);
            delete(map.get(key));
            addToHead(node);
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            delete(map.get(key));
        }

        if(map.size() == capacity){
             delete(tail.prev);
        }

        addToHead(new DLL(key,value));
    }


    private void delete(DLL curr){
        //delete 
        map.remove(curr.key);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }


    private void addToHead(DLL curr){

        map.put(curr.key,curr);

        //insert after head
        DLL nextNode = head.next;
        
        head.next = curr;
        curr.prev = head;

        nextNode.prev = curr;
        curr.next = nextNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */