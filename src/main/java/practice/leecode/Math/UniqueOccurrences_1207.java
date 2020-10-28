package practice.leecode.Math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences_1207 {

    private Set<Integer> set;
    private Map<Integer, Integer> map;

    public boolean uniqueOccurrences(int[] arr) {
        set = new HashSet<>();
        map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            set.add(map.get(arr[i]));
        }
        return map.size() == set.size();
    }

}
