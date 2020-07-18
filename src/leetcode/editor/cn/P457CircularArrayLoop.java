//给定一个含有正整数和负整数的环形数组 nums。 如果某个索引中的数 k 为正数，则向前移动 k 个索引。相反，如果是负数 (-k)，则向后移动 k 个索引
//。因为数组是环形的，所以可以假设最后一个元素的下一个元素是第一个元素，而第一个元素的前一个元素是最后一个元素。 
//
// 确定 nums 中是否存在循环（或周期）。循环必须在相同的索引处开始和结束并且循环长度 > 1。此外，一个循环中的所有运动都必须沿着同一方向进行。换句话说
//，一个循环中不能同时包括向前的运动和向后的运动。 
// 
//
// 示例 1： 
//
// 输入：[2,-1,1,2,2]
//输出：true
//解释：存在循环，按索引 0 -> 2 -> 3 -> 0 。循环长度为 3 。
// 
//
// 示例 2： 
//
// 输入：[-1,2]
//输出：false
//解释：按索引 1 -> 1 -> 1 ... 的运动无法构成循环，因为循环的长度为 1 。根据定义，循环的长度必须大于 1 。
// 
//
// 示例 3: 
//
// 输入：[-2,1,-1,-2,-2]
//输出：false
//解释：按索引 1 -> 2 -> 1 -> ... 的运动无法构成循环，因为按索引 1 -> 2 的运动是向前的运动，而按索引 2 -> 1 的运动是向后的
//运动。一个循环中的所有运动都必须沿着同一方向进行。 
//
// 
//
// 提示： 
//
// 
// -1000 ≤ nums[i] ≤ 1000 
// nums[i] ≠ 0 
// 0 ≤ nums.length ≤ 5000 
// 
//
// 
//
// 进阶： 
//
// 你能写出时间时间复杂度为 O(n) 和额外空间复杂度为 O(1) 的算法吗？ 
// Related Topics 数组 双指针 
// 👍 38 👎 0

  
package leetcode.editor.cn;
//java:环形数组循环
public class P457CircularArrayLoop{
    public static void main(String[] args) {
        Solution solution = new P457CircularArrayLoop().new Solution();
        solution.circularArrayLoop(new int[]{1,1,2});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        boolean conboolean = false;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){ //如果遇到已经访问过，被标记的地方 就不再访问
                int slow = i; //对于每个i位置，慢指针指向i
                int fast = i;
                int flag = nums[i] > 0 ? 1 : -1;
                while(flag * nums[fast] > 0 && flag * nums[getNext(nums,fast,n)] > 0) {//慢指针指向的数要和快指针指向的数正负相同，这个不难理解。并且慢指针指向的数还要跟快指针的下一个位置上的数符号相同
                    //若快慢指针还不相同的，则分别更新，慢指针走一步，快指针走两步
                    slow = getNext(nums,slow,n);
                    fast = getNext(nums,getNext(nums,fast,n),n);

                    if(slow == fast) {
                        if(slow == getNext(nums,slow,n)) {//直到当快慢指针相遇的时候，就是环出现的时候，但是这里有个坑，即便快慢指针相遇了，也不同立马返回 true，因为题目中说了了环的长度必须大于1，所以我们要用慢指针指向的数和慢指针下一个位置上的数比较，若相同，则说明环的长度为1，此时并不返回 false，而且 break 掉 while 循环。因为这只能说以i位置开始的链表无符合要求的环而已，后面可能还会出现符合要求的环。但是若二者不相同的话，则已经找到了符合要求的环，直接返回 true。
                            break;
                        }
                        return true;
                    }
                }
                //当 while 循环退出后，我们需要标记已经走过的结点，从而提高运算效率，方法就是将慢指针重置为i，再用一个 while 循环，条件是 nums[i] 和 慢指针指的数正负相同
                slow = i;
                while(flag * nums[slow] > 0) {
                    nums[slow] = 0;
                    slow = getNext(nums,slow,n);
                }
            }
        }
        return false;
    }

    public int getNext(int[] nums, int next, int len){
        next = (next + nums[next] + 5000 * len) % len;
        return next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}