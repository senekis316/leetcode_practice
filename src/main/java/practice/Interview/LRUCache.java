package practice.Interview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCache<K, V> implements Cache<K, V>{

    private static final int DEFAULT_CAPACITY = 16;

    private volatile int size = 0;
    private volatile int capacity;
    private volatile Node<K, V> head;
    private volatile Node<K, V> tail;
    private volatile Map<K, Node<K, V>> table = new ConcurrentHashMap<>();

    public LRUCache() {
        this(DEFAULT_CAPACITY);
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(null, null, 0);
        this.tail = new Node(null, null, 0);
        new ConcurrentHashMap();
    }

    @Override
    public V get(K key) {
        return table.get(key).getVal();
    }

    @Override
    public boolean put(K key, V val) {
        synchronized (table) {
            int hash = key.hashCode();
            if (size <= capacity) {
                Node<K, V> newNode = new Node(key, val, hash);
                Node<K, V> oldNode = head.next;
                newNode.next = oldNode;
                head.next = newNode;
                table.put(key, newNode);
                if (size == 0) {
                    tail.prev = newNode;
                    newNode.next = tail;
                }
                size++;
            } else {
                Node<K, V> deleteNode = tail.prev;
                deleteNode.prev.next = tail;
                tail.prev = deleteNode.prev;
                deleteNode.prev = null;
                deleteNode.next = null;
                table.remove(deleteNode.getKey());
            }
        }

        return false;
    }

    static class Node<K,V> {
        final int hash;
        final K key;
        volatile V val;
        volatile Node<K,V> prev;
        volatile Node<K,V> next;

        Node(K key, V val, int hash) {
            this.key = key;
            this.val = val;
            this.hash = hash;
        }

        Node(K key, V val, int hash, Node prev, Node next) {
            this.key = key;
            this.val = val;
            this.hash = hash;
            this.prev = prev;
            this.next = next;
        }

        public K getKey() {
            return this.key;
        }

        public V getVal() {
            return this.val;
        }

    }

}
