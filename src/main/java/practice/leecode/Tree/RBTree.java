package practice.leecode.Tree;

import lombok.val;

public class RBTree {

    public RBTreeNode root;

    public static class RBTreeNode {
        public int value;
        public boolean isRed;
        public RBTreeNode left;
        public RBTreeNode right;
        public RBTreeNode parent;
        public RBTreeNode(int value) {
            this.value = value;
            this.isRed = true;
        }
        public RBTreeNode(int value, boolean isRed) {
            this.value = value;
            this.isRed = isRed;
        }
    }

    public RBTreeNode find(int value) {
        RBTreeNode node = root;
        while (node != null) {
            if (node.value == value) {
                return node;
            } else if (node.value > value) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }

    public void insert(int value) {

        RBTreeNode node = new RBTreeNode(value);

        //情况1:空树, 新插入节点为根结点
        if (root == null) {
            root = node;
            root.isRed = false;
            return;
        }

        //新插入节点不是根节点，则需查找插入位置
        RBTreeNode position = root;
        RBTreeNode parent = null;
        boolean isLeftChild = false;
        while (position != null) {
            parent = position;
            if (value < position.value) {
                isLeftChild = true;
                position = parent.left;
            } else if (value > position.value) {
                isLeftChild = false;
                position = parent.right;
            } else {
                return;
            }
        }

        //在对应位置插入元素
        if (isLeftChild) {
            parent.left = node;
        } else {
            parent.right = node;
        }

        //情况2: 父节点为黑色，无需重新平衡，直接返回即可
        if (!parent.isRed) {
            return;
        }

        //父节点为红色，需要进行再平衡
        balanceInsert(node);

    }

    public void balanceInsert(RBTreeNode node) {
        RBTreeNode parent, grandParent;
        while ((parent = node.parent) != null && parent.isRed) {
            grandParent = parent.parent;
            RBTreeNode uncle = grandParent.left;
            if (uncle == parent) {
                uncle = grandParent.right;
            }
            //情况3: 父亲和叔伯节点都为红，则需要将颜色向上一层传递，爷爷节点转红，父亲和叔伯节点转黑
            if (uncle != null && uncle.isRed) {
                uncle.isRed = false;
                parent.isRed = false;
                grandParent.isRed = true;
                node = grandParent;
                continue;
            }
            if (grandParent.left == parent) {
                //情况4: 父红叔黑，爷父子成<型, 左旋至情况5
                if (node == parent.right) {
                    leftRotate(parent);
                    RBTreeNode tmp = node;
                    node = parent;
                    parent = tmp;
                }
                //情况5: 父红叔黑，爷父子成/型，变父黑爷红，然后右旋
                parent.isRed = false;
                grandParent.isRed = true;
                rightRotate(grandParent);
            } else {
                //情况6: 父红叔黑，爷父子成>型, 左旋至情况5
                if (node == parent.left) {

                }
            }
        }
        root.isRed = false;
    }

    public void leftRotate(RBTreeNode node) {
        RBTreeNode parent = node.parent;
        RBTreeNode right = node.right;
        if (parent == null) {
            root = right;
            right.parent = null;
        } else {
            if (parent.left == node) {
                parent.left = right;
            } else {
                parent.right = right;
            }
            right.parent = parent;
        }
        node.parent = right;
        node.right = right.left;
        if (right.left != null) {
            right.left.parent = node;
        }
        right.left = node;
    }

    public void rightRotate(RBTreeNode node) {
        RBTreeNode parent = node.parent;
        RBTreeNode left = node.left;
        if (parent == null) {
            root = node.left;
            left.parent = null;
        } else {
            if (parent.right == node) {
                parent.right = left;
            } else {
                parent.left = left;
            }
            left.parent = parent;
        }
        node.parent = left;
        node.left = left.right;
        if (left.right != null) {
            left.right.parent = node;
        }
        left.right = node;
    }


}
