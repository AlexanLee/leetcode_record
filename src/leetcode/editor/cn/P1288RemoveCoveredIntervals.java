//给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。 
//
// 只有当 c <= a 且 b <= d 时，我们才认为区间 [a,b) 被区间 [c,d) 覆盖。 
//
// 在完成所有删除操作后，请你返回列表中剩余区间的数目。 
//
// 
//
// 示例： 
//
// 
//输入：intervals = [[1,4],[3,6],[2,8]]
//输出：2
//解释：区间 [3,6] 被区间 [2,8] 覆盖，所以它被删除了。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= intervals.length <= 1000 
// 0 <= intervals[i][0] < intervals[i][1] <= 10^5 
// 对于所有的 i != j：intervals[i] != intervals[j] 
// 
// Related Topics Line Sweep 
// 👍 11 👎 0

  
package leetcode.editor.cn;

import java.util.Arrays;
import java.util.Comparator;

//java:删除被覆盖区间
public class P1288RemoveCoveredIntervals{
    public static void main(String[] args) {
        Solution solution = new P1288RemoveCoveredIntervals().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        //对起点进行升序排序，如果起点相同，则对终点进行降序排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // Sort by start point.
                // If two intervals share the same start point,
                // put the longer one to be the first.
                return o1[0] == o2[0] ? o2[1] - o1[1]: o1[0] - o2[0];
            }
        });

        int count = 0;
        int end, preend = 0;
        for(int[] cur : intervals){
            end = cur[1];
            if(end > preend){
                count ++;
                preend = end;
            }
        }

        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}