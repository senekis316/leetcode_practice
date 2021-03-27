package practice.leecode.Arrays;

import practice.leecode.DeepPriority.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator_341 implements Iterator<Integer> {

    private List<Integer> list;
    private Iterator<Integer> iterator;

    public NestedIterator_341(List<NestedInteger> nestedList) {
        this.list = new ArrayList();
        dfs(nestedList);
        this.iterator = list.iterator();
    }

    public void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else {
                dfs(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    public interface NestedInteger {
        boolean isInteger();
        Integer getInteger();
        List<NestedInteger> getList();
    }

}
