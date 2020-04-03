//给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。请问
// k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 
//
// 示例 1： 
//
// 输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1 
//
// 示例 2: 
//
// 输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 1000 
// 
//
// 注意：本题与主站 343 题相同：https://leetcode-cn.com/problems/integer-break/ 
// Related Topics 数学 动态规划

  
package leetcode.editor.cn;
//java:剪绳子 II
public class P面试题14IIJianShengZiIiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题14IIJianShengZiIiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
// class Solution {   //大数时该方法出错
//     public int cuttingRope(int n) {
//         if(n <= 3) return n - 1;
//         int mod = 1000000007;
//         long a = n / 3, b = n % 3;
//         if(b == 0) return (int)(Math.pow(3, a) % mod);
//         if(b == 1) return (int)(Math.pow(3, a - 1) * 4 % mod);
//         return (int)(Math.pow(3, a) * 2 % mod);
//     }
// }
    class Solution {
        public int cuttingRope(int n) {
            if(n == 2) {
                return 1;
            }
            if(n == 3){
                return 2;
            }
            int mod = (int)1e9 + 7;
            long res = 1;
            while(n > 4) {
                res *= 3;
                res %= mod;
                n -= 3;
            }
            return (int)(res * n % mod);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}