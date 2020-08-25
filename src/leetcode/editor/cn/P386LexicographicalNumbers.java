//给定一个整数 n, 返回从 1 到 n 的字典顺序。 
//
// 例如， 
//
// 给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。 
//
// 请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 n 小于等于 5,000,000。 
// 👍 115 👎 0


package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

//java:字典序排数
public class P386LexicographicalNumbers {
    public static void main(String[] args) {
        Solution solution = new P386LexicographicalNumbers().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<Integer> ans = new LinkedList<>();

        public List<Integer> lexicalOrder(int n) {
            for (int i = 1; i < 10; i++) {
                DFS(i, n);
            }
            return ans;
        }

        public void DFS(int cur, int n){
            if(cur > n){
                return;
            }
            ans.add(cur);
            for (int i = 0; i < 10; i++) {
                DFS(cur*10+i, n);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}