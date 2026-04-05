import java.util.*;

class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail; // dummy nodes

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    // remove node from list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // insert node before tail (most recent)
    private void insert(Node node) {
        Node prevNode = tail.prev;

        prevNode.next = node;
        node.prev = prevNode;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);     // remove from current position
        insert(node);     // move to most recent

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            remove(node);
            insert(node);
        } else {

            if (map.size() == capacity) {
                Node lru = head.next; // least recent
                remove(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);
            insert(newNode);
            map.put(key, newNode);
        }
    }
}