//给定一个二叉树，返回它的 后序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [3,2,1] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 376 👎 0


package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//java:二叉树的后序遍历
public class P145BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new P145BinaryTreePostorderTraversal().new Solution();
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            // 迭代写法 使用栈
            List<Integer> ans = new LinkedList<>();
            if(root == null){
                return ans;
            }
            Stack<TreeNode> stack = new Stack<>();
            TreeNode pre = null;
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode cur = stack.peek();
                if((cur.left == null && cur.right == null) || (pre != null && (cur.left == pre || cur.right == pre))){
                    ans.add(cur.val);
                    pre = cur;
                    stack.pop();
                }else{
                    if(cur.right != null) {
                        stack.push(cur.right);
                    }
                    if(cur.left != null){
                        stack.push(cur.left);
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}