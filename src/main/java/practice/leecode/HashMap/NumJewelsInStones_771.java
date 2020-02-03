package practice.leecode.HashMap;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones_771 {

    public int numJewelsInStones(String J, String S) {
        Set<Character> gems = new HashSet<>();
        for (char gem: J.toCharArray()) {
            gems.add(gem);
        }
        int stones = 0;
        for (char stone: S.toCharArray()) {
            if (gems.contains(stone)) {
                stones++;
            }
        }
        return stones;
    }

}
