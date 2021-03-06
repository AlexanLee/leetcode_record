//给你一个 m * n 的矩阵 mat，以及一个整数 k ，矩阵中的每一行都以非递减的顺序排列。 
//
// 你可以从每一行中选出 1 个元素形成一个数组。返回所有可能数组中的第 k 个 最小 数组和。 
//
// 
//
// 示例 1： 
//
// 输入：mat = [[1,3,11],[2,4,6]], k = 5
//输出：7
//解释：从每一行中选出一个元素，前 k 个和最小的数组分别是：
//[1,2], [1,4], [3,2], [3,4], [1,6]。其中第 5 个的和是 7 。  
//
// 示例 2： 
//
// 输入：mat = [[1,3,11],[2,4,6]], k = 9
//输出：17
// 
//
// 示例 3： 
//
// 输入：mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
//输出：9
//解释：从每一行中选出一个元素，前 k 个和最小的数组分别是：
//[1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]。其中第 7 个的和是 9 。 
// 
//
// 示例 4： 
//
// 输入：mat = [[1,1,10],[2,2,9]], k = 7
//输出：12
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat.length[i] 
// 1 <= m, n <= 40 
// 1 <= k <= min(200, n ^ m) 
// 1 <= mat[i][j] <= 5000 
// mat[i] 是一个非递减数组 
// 
// Related Topics 堆

  
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

//java:有序矩阵中的第 k 个最小数组和
public class P1439FindTheKthSmallestSumOfAMatrixWithSortedRows{
    public static void main(String[] args) {
        Solution solution = new P1439FindTheKthSmallestSumOfAMatrixWithSortedRows().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // 1. 暴力解法
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> answer = new ArrayList<>(k);
        for (int i = 0; i < n; i++) {
            answer.add(mat[0][i]);
        }
        for (int i = 1; i < m; i++) {
            List<Integer> newSum = new ArrayList<>();
            for (int oldSum : answer) {
                for (int num : mat[i]) {
                    newSum.add(oldSum + num);
                }
            }
            Collections.sort(newSum);
            answer.clear();
            int len = Math.min(k, newSum.size());
            for (int j = 0; j < len; j++) {
                answer.add(newSum.get(j));
            }
        }
        return answer.get(k - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}