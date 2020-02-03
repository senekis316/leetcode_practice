package practice.leecode.DeepPriority;

import java.util.List;

public class DeepSum_339 {


    public int depthSum(List<NestedInteger> nestedList) {
        return depthSum(nestedList, 1);
    }

    private int depthSum(List<NestedInteger> nestedList, int deep) {
        int sum = 0;
        for (int i = 0; i < nestedList.size(); i++) {
            if (nestedList.get(i).isInteger()) {
                sum += nestedList.get(i).getInteger() * deep;
            } else {
                sum += depthSum(nestedList.get(i).getList(), deep + 1);
            }
        }
        return sum;
    }


}
