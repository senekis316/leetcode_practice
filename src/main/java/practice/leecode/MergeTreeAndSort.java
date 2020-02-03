package practice.leecode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import practice.utils.TreeNode;

public class MergeTreeAndSort {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if(root1 != null){
            list = getTreeNodeValue(list, root1);
        }

        if(root2 != null){
            list = getTreeNodeValue(list, root2);
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2){
                    return 1;
                }else if(o1 > o2){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        return list;
    }

    private List<Integer> getTreeNodeValue(List<Integer> list, TreeNode root){
        list.add(root.val);
        if(root.left != null){
            getTreeNodeValue(list, root.left);
        }

        if (root.right != null){
            getTreeNodeValue(list, root.right);
        }

        return list;
    }
}
