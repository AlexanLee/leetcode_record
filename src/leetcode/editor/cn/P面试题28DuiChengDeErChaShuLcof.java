//请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
// 1 
// / \ 
// 2 2 
// / \ / \ 
//3 4 4 3 
//但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
// 1 
// / \ 
// 2 2 
// \ \ 
// 3 3 
//
// 
//
// 示例 1： 
//
// 输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：root = [1,2,2,null,3,null,3]
//输出：false 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 1000 
//
// 注意：本题与主站 101 题相同：https://leetcode-cn.com/problems/symmetric-tree/ 
// Related Topics 树

  
package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

//java:对称的二叉树
public class P面试题28DuiChengDeErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题28DuiChengDeErChaShuLcof().new Solution();
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // 1. 递归
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//        return reback(root.left, root.right);
//    }
//    public boolean reback(TreeNode left,TreeNode right){
//        if(left == null && right == null) return true;
//        if(left == null || right == null || left.val != right.val) return false;
//        return reback(left.left, right.right) && reback(left.right, right.left);
//    }
    // 2. bfs
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Deque<TreeNode> d = new LinkedList<>();
        d.addFirst(root.left);
        d.addLast(root.right);

        while (!d.isEmpty()) {
            TreeNode leftnode = d.removeFirst();
            TreeNode rightnode = d.removeLast();
            if (leftnode == null && rightnode == null)
                continue;
            if (leftnode == null || rightnode == null || leftnode.val != rightnode.val)
                return false;

            d.addFirst(leftnode.right);
            d.addFirst(leftnode.left);
            d.addLast(rightnode.left);
            d.addLast(rightnode.right);

        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}