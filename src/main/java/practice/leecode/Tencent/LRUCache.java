package practice.leecode.qq;

import java.util.*;


public class LRUCache {

    private LRU cache;

    public LRUCache(int capacity) {
        this.cache = new LRU(capacity);
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    class LRU extends LinkedHashMap<Integer, Integer> {
        int capacity;

        public LRU(int capacity) {
            // 注意，需要开启 ordering mode，此时若元素被访问（put、get）就会被移到链表尾
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        /**
         * removeEldestE***y 方法会在插入元素之后调用，用以判断是否需要移除链表表头元素（最近最少访问元素）
         */
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return this.size() > capacity;
        }
    }
}
