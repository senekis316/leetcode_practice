package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.validator.internal.engine.messageinterpolation.InterpolationTerm;
import practice.utils.TreeNode;

public class MergeTreeAndOrder {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> returnList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        if(root1 != null){
            list1.add(root1.val);
            TreeNode[] arrayTreeNode = getNextTreeNode(root1);
            while (arrayTreeNode != null){
                list1.add(arrayTreeNode[0].val);
                list1.add(arrayTreeNode[1].val);
                arrayTreeNode = getNextTreeNode(arrayTreeNode[0]);
            }
            while (arrayTreeNode != null){
                list1.add(arrayTreeNode[0].val);
                list1.add(arrayTreeNode[1].val);
                arrayTreeNode = getNextTreeNode(arrayTreeNode[0]);
            }
        }

        return returnList;
    }

    private TreeNode[] getNextTreeNode(TreeNode treeNode){
        TreeNode[] arrayTreeNode = new TreeNode[2];
        if(treeNode == null){
            return null;
        }
        if(treeNode.left != null && treeNode.right != null){
            arrayTreeNode[0] = treeNode.left;
            arrayTreeNode[1] = treeNode.right;
        }else{
            arrayTreeNode = null;
        }
        return arrayTreeNode;
    }

}
