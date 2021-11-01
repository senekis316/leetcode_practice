package practice.leecode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies_575 {

    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int i = 0; i <candyType.length; i++) {
            types.add(candyType[i]);
        }
        return Math.min(candyType.length / 2, types.size());
    }

}
