package practice.leecode.Set;

import java.util.*;

public class RandomizedSet_380 {

    private Random random;
    private List<Integer> list;
    private Map<Integer, Integer> map;

    /** Initialize your data structure here. */
    public RandomizedSet_380() {
        random = new Random();
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            int value = list.get(list.size() - 1);
            map.put(value, index);
            list.set(index, value);
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

}
