/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right ==null){
            return;
        }
        TreeNode node = root;
        TreeNode rightmost;
        TreeNode temp;

        while(node != null){
            if(node.left != null){
                temp = node.right;
                node.right = node.left;
                node.left = null;
                rightmost = node.right;
                while(rightmost.right!= null){
                    rightmost = rightmost.right;
                }
                rightmost.right = temp;
            }
            node = node.right;
        }
    }
}
