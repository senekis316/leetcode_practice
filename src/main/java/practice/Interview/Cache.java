package practice.Interview;

public interface Cache<K, V> {

    V get(K key);

    boolean put(K key, V val);

}
