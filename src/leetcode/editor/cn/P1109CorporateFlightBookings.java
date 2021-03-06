//这里有 n 个航班，它们分别从 1 到 n 进行编号。 
//
// 我们这儿有一份航班预订表，表中第 i 条预订记录 bookings[i] = [i, j, k] 意味着我们在从 i 到 j 的每个航班上预订了 k 个座
//位。 
//
// 请你返回一个长度为 n 的数组 answer，按航班编号顺序返回每个航班上预订的座位数。 
//
// 
//
// 示例： 
//
// 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
//输出：[10,55,45,25,25]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= bookings.length <= 20000 
// 1 <= bookings[i][0] <= bookings[i][1] <= n <= 20000 
// 1 <= bookings[i][2] <= 10000 
// 
// Related Topics 数组 数学 
// 👍 81 👎 0

  
package leetcode.editor.cn;
//java:航班预订统计
public class P1109CorporateFlightBookings{
    public static void main(String[] args) {
        Solution solution = new P1109CorporateFlightBookings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int start = bookings[i][0];
            int end = bookings[i][1];
            for (int j = start; j <= end; j++) {
                ans[j-1] += bookings[i][2];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}