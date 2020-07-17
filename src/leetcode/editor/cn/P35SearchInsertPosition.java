//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 574 👎 0

  
package leetcode.editor.cn;
//java:搜索插入位置
public class P35SearchInsertPosition{
    public static void main(String[] args) {
        Solution solution = new P35SearchInsertPosition().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        // 本质上相当于寻找第一个大于target数的位置 搜索范围[0, len]

        int len = nums.length;
        int left = 0, right = len; //这里初始化right为len，因为数组右边界也可能是我们要找的位置
        while(left < right){
            int mid = left + (right - left) / 2;
//            System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}