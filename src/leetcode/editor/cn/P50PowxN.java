//实现 pow(x, n) ，即计算 x 的 n 次幂函数。 
//
// 示例 1: 
//
// 输入: 2.00000, 10
//输出: 1024.00000
// 
//
// 示例 2: 
//
// 输入: 2.10000, 3
//输出: 9.26100
// 
//
// 示例 3: 
//
// 输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25 
//
// 说明: 
//
// 
// -100.0 < x < 100.0 
// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。 
// 
// Related Topics 数学 二分查找

  
package leetcode.editor.cn;

import java.util.concurrent.ConcurrentHashMap;

//java:Pow(x, n)
public class P50PowxN{
    public static void main(String[] args) {
        Solution solution = new P50PowxN().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //1. 快速幂+递归
    public double quickMul(double x, long N){
        if(N == 0){
            return 1.0;
        }
        double y = quickMul(x, N/2);
        return N % 2 == 1 ? y * y * x : y * y;
    }

    //2. 快速幂+迭代
    public double quickMul2(double x, long N){
        double res = 1.0;
        double x_contribute = x;
        while(N > 0){
            if(N % 2 == 1){
                res *= x_contribute;
            }
            x_contribute *= x_contribute;
            N /= 2;
        }
        return res;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N>=0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}