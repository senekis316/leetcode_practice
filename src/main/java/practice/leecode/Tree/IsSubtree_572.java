package practice.leecode.Tree;

import practice.utils.TreeNode;

public class IsSubtree_572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean flag = false;
        if (s != null && t != null) {
            if (s.val == t.val) {
                flag = isEqualTree(s, t);
            }
            if (!flag) {
                flag = isSubtree(s.left, t);
            }
            if (!flag) {
                flag = isSubtree(s.right, t);
            }
        }
        return flag;
    }


    private boolean isEqualTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        } else if (s.val != t.val) {
            return false;
        } else {
            return isEqualTree(s.left, t.left) && isEqualTree(s.right, t.right);
        }
    }

    //方法1: 自己写的
    /*private boolean isSub;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        isSub = false;
        searchSubTree(s, t);
        return isSub;
    }

    private void searchSubTree(TreeNode s, TreeNode t) {
        if (isSub == false && s != null) {
            if (isEqualTree(s, t)) {
                isSub = true;
            } else {
                searchSubTree(s.left, t);
                searchSubTree(s.right, t);
            }
        }
    }

    private boolean isEqualTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        } else {
            return s.val == t.val ? isEqualTree(s.left, t.left) && isEqualTree(s.right, t.right) : false;
        }

    }*/

}
