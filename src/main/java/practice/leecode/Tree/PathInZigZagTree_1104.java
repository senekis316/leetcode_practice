package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import lombok.var;

public class PathInZigZagTree_1104 {

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> nums = new ArrayList<>();
        int level = (int)(Math.log(label) / Math.log(2));
        while (label > 1) {
            nums.add(label);
            label = (int)(3 * Math.pow(2, --level) - label / 2 - 1);
        }
        nums.add(1);
        Collections.reverse(nums);
        return nums;
    }

}
