package practice.leecode;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePaths(root, "", paths);
        return paths;
    }

    public void binaryTreePaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path += "->";
                binaryTreePaths(root.left, path, paths);
                binaryTreePaths(root.right, path, paths);
            }
        }
    }


    //方法1
    /*private List<String> paths;
    private StringBuilder path;

    public BinaryTreePaths_257() {
        this.paths = new ArrayList<>();
        this.path = new StringBuilder();
    }

    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null) {
            return paths;
        }

        appendPath(root, path);

        if (root.left == null && root.right == null) {
            paths.add(path.toString());
            return paths;
        }

        if (root.left != null) {
            binaryTreePaths(root.left);
            subtractPath(root, path);
        }

        if (root.right != null) {
            binaryTreePaths(root.right);
            subtractPath(root, path);
        }

        return paths;

    }

    private StringBuilder appendPath(TreeNode root, StringBuilder path) {
        return path.length() == 0 ? path.append(root.val) : path.append("->" + root.val);
    }

    private StringBuilder subtractPath(TreeNode root, StringBuilder path) {
        int lastIndexOf = path.lastIndexOf("->");
        return lastIndexOf != -1 ? path.delete(lastIndexOf, path.length()) : path;
    }*/


}
