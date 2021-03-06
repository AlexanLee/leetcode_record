//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 示例: 
//
// 输入："23"
//输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
// 
//
// 说明: 
//尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。 
// Related Topics 字符串 回溯算法

  
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//java:电话号码的字母组合
public class P17LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args) {
        String str = new String("234");
        Solution solution = new P17LetterCombinationsOfAPhoneNumber().new Solution();
        solution.letterCombinations(str);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return ans;
        find(digits, 0, "");
        return ans;
    }
    public void find(String digits, int index, String s){
        if(index == digits.length()){
            ans.add(s);
            return;
        }
        String numstr = phone.get(digits.substring(index,index+1));
        for (int i = 0; i < numstr.length(); i++) {
            find(digits, index+1, s+numstr.charAt(i));
        }
        return;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}