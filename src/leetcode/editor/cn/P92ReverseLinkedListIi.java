//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。 
//
// 说明: 
//1 ≤ m ≤ n ≤ 链表长度。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL 
// Related Topics 链表 
// 👍 427 👎 0


package leetcode.editor.cn;

//java:反转链表 II
public class P92ReverseLinkedListIi {
    public static void main(String[] args) {
        Solution solution = new P92ReverseLinkedListIi().new Solution();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {

            ListNode result = head;

            ListNode m_pre = null;
            int change_len = n - m + 1;

            int index = 1;
            while(index < m){
                m_pre = head;
                head = head.next;
                index ++;
            }
            ListNode m_head = head;

            ListNode pre = null;
            ListNode temp = null;
            while(change_len != 0){
                temp = head.next;
                head.next = pre;
                pre = head;
                head = temp;
                change_len--;
            }
            m_head.next = head;
            if(m_pre == null){
                result = pre;
            }else{
                m_pre.next = pre;
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}