//给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。 
//
// 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0,
// 2, 5]。 
//
// 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。 
//
// 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？ 
//
// 
//
// 示例： 
//
// 输入: words = ["time", "me", "bell"]
//输出: 10
//说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 2000 
// 1 <= words[i].length <= 7 
// 每个单词都是小写字母 。 
// 
//

  
package leetcode.editor.cn;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//java:单词的压缩编码
public class P820ShortEncodingOfWords{
    public static void main(String[] args) {
        Solution solution = new P820ShortEncodingOfWords().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumLengthEncoding(String[] words) {
        // 法1 字符串包含
//        // 先按字符串长度进行排序
//        Arrays.sort(words, (w1, w2) -> w2.length() - w1.length());
//
//        // 然后在进行匹配的计算
//        StringBuilder ans = new StringBuilder();
//        for (String word : words) {
//            if (ans.indexOf(word + "#") < 0) {
//                ans = ans.append(word + "#");
//            }
//        }
//        return ans.toString().length();
        // 法2 Set去重
//        Set<String> set = new HashSet<>(Arrays.asList(words));
//        String a = new String();
//        for(String word : words){
//            for (int i = 1; i < word.length(); i++) {
//                set.remove(word.substring(i));
//            }
//        }
//        int ans = 0;
//        for(String word : set){
//            ans += word.length() + 1;
//        }
//        return ans;
        // 法3 字典树
        int len = 0;
        Trie trie = new Trie();
        // 先对单词列表根据单词长度由长到短排序
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        // 单词插入trie，返回该单词增加的编码长度
        for (String word: words) {
            len += trie.insert(word);
        }
        return len;
    }
}
    // 定义字典树tire
    class Trie {

        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public int insert(String word) {
            TrieNode cur = root;
            boolean isNew = false;
            // 倒着插入单词，判断共同的后缀
            for (int i = word.length() - 1; i >= 0; i--) {
                int c = word.charAt(i) - 'a';
                if (cur.children[c] == null) {
                    isNew = true; // 是新单词
                    cur.children[c] = new TrieNode();
                }
                cur = cur.children[c];
            }
            // 如果是新单词的话编码长度增加新单词的长度+1，否则不变。
            return isNew? word.length() + 1: 0;
        }
    }

    class TrieNode {
        char val;
        TrieNode[] children = new TrieNode[26];

        public TrieNode() {}
    }


    // 官方题解
//    class Solution {
//        public int minimumLengthEncoding(String[] words) {
//            TrieNode trie = new TrieNode();
//            Map<TrieNode, Integer> nodes = new HashMap();
//
//            for (int i = 0; i < words.length; ++i) {
//                String word = words[i];
//                TrieNode cur = trie;
//                for (int j = word.length() - 1; j >= 0; --j)
//                    cur = cur.get(word.charAt(j));
//                nodes.put(cur, i);
//            }
//
//            int ans = 0;
//            for (TrieNode node: nodes.keySet()) {
//                if (node.count == 0)
//                    ans += words[nodes.get(node)].length() + 1;
//            }
//            return ans;
//
//        }
//    }
//
//    class TrieNode {
//        TrieNode[] children;
//        int count;
//        TrieNode() {
//            children = new TrieNode[26];
//            count = 0;
//        }
//        public TrieNode get(char c) {
//            if (children[c - 'a'] == null) {
//                children[c - 'a'] = new TrieNode();
//                count++;
//            }
//            return children[c - 'a'];
//        }
//    }

//leetcode submit region end(Prohibit modification and deletion)

}