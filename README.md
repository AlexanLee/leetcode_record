# leetcode_record

---


## 剑指offer 第2版

| Title-Link                                                   | Describe                                                     | Method                                       | Note |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------------- | ---- |
| 03 数组中重复的数字                                          | 长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内，找出数组中任意一个重复的数字 | 数组 HashSet                                 | 1    |
| 04 二维数组中的查找                                          | 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序，判断数组中是否含有某个整数 | 数组 双指针                                  | 1    |
| 05 替换空格                                                  | 把字符串 s 中的每个空格替换成"%20"                           | 字符串操作                                   | 1    |
| 06 从尾到头打印链表                                          | 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回） | 链表操作                                     | 1    |
| 07 重建二叉树                                                | 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树       | 递归 树                                      | 2    |
| 09 用两个栈实现队列                                          | 用两个栈实现一个队列                                         | 栈                                           | 1    |
| 10I 斐波那契数列                                             | 求斐波那契（Fibonacci）数列的第 n 项                         | 递归 动态规划                                | 1    |
| 10II 青蛙跳台阶问题                                          | 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法 | 动态规划，递归                               | 1    |
| 11 旋转数组的最小数字                                        | 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素     | 二分                                         | 1    |
| 12 矩阵中的路径                                              | 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径       | 矩阵搜索 DFS                                 | 2    |
| 13 机器人的运动范围                                          | 一个机器人从坐标 [0, 0] 的格子开始移动，不能进入行坐标和列坐标的数位之和大于k的格子，问该机器人能够到达多少个格子 | 矩阵搜索 DFS BFS                             | 2    |
| 14_1 剪绳子 整数分解                                         | 长度为 n 的绳子，请把绳子剪成整数长度的 m 段，每段长度的乘积最大是多少？ | 动态规划 递归 找规律                         | 2    |
| 14_2 剪绳子II                                                | 长度为 n 的绳子，请把绳子剪成整数长度的 m 段，每段长度的乘积最大是多少？答案需要取模 1e9+7（1000000007） | 整数分解II 找规律 贪心                       | 2    |
| 15 二进制中1的个数                                           | 二进制中1的个数                                              | n&=(n-1)可以消除n的最后一位1                 | 1    |
| 16 数值的整数次方                                            | 求base的exponent次方。不得使用库函数                         | 快速幂 递归 迭代                             | 2    |
| 17 打印从1到最大的n位数                                      | 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数           | 数学                                         | 1    |
| 18 删除链表的节点                                            | 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点 | 链表                                         | 1    |
| 19 正则表达式匹配                                            | 实现一个函数用来匹配包含'. '和'*'的正则表达式                | 递归，动态规划                               | 3    |
| 20 表示数值的字符串 数学                                     | 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）   | 数学                                         | 2    |
| 21 调整数组顺序使奇数位于偶数前面                            | 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分 | 双指针                                       | 1    |
| 22 链表中倒数第k个节点 双指针                                | 输入一个链表，输出该链表中倒数第k个节点                      | 链表                                         | 1    |
| 24 反转链表                                                  | 输入一个链表的头节点，反转该链表并输出反转后链表的头节点     | 双指针，递归                                 | 1    |
| 25 合并两个排序的链表                                        | 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的 | 链表，递归                                   | 1    |
| 26 树的子结构 递归                                           | 输入两棵二叉树A和B，判断B是不是A的子结构。                   | 递归                                         | 2    |
| 27 二叉树的镜像                                              | 请完成一个函数，输入一个二叉树，该函数输出它的镜像。         | 递归                                         | 1    |
| 28 对称的二叉树                                              | 请实现一个函数，用来判断一棵二叉树是不是对称的               | 递归                                         | 1    |
| 29 顺时针打印矩阵 模拟                                       | 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字 | 数学                                         | 1    |
| 30 包含min函数的栈 辅助栈                                    | 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中 | 辅助栈                                       | 1    |
| 31 栈的压入，弹出序列                                        | 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序 | 模拟栈                                       | 2    |
| 32 I，II，III 从上到下打印二叉树                             | 从上到下打印出二叉树的每个节点：I同一层的节点按照从左到右的顺序打印；II同一层的节点按从左到右的顺序打印，每一层打印到一行；III之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印 | BFS                                          | 2    |
| 33 二叉搜索树的后序遍历                                      | 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果 | 递归                                         | 2    |
| 34 二叉树中和为某一值的路径 前序遍历                         | 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径 | 前序遍历                                     | 2    |
| 35 复杂链表的复制 哈希表                                     | 复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null | HashMap                                      | 2    |
| 36 二叉搜索树与双向链表 中序遍历                             | 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。 | 中序遍历                                     | 2    |
| 37 序列化二叉树 DFS BFS                                      |                                                              |                                              |      |
| 38 字符串的排列 全排列 递归                                  | 输入一个字符串，打印出该字符串中字符的所有排列。             | 递归                                         | 2    |
| [39 数组中出现次数超过一半的数字](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题39ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof.java) | 数组中出现次数超过一半的数字                                 | 排序，取中间 摩尔投票法                      |      |
| [40 最小的k个数](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题40ZuiXiaoDeKgeShuLcof.java) | 获得数组中最小的k个数                                        | 快排 大根堆 二叉搜索树                       |      |
| [41 数据流中的中位数](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题41ShuJuLiuZhongDeZhongWeiShuLcof.java) | 设计一个支持以下添加和返回中位数的数据结构                   | 动态维护一个大根堆和小根堆 二分查找+插入排序 |      |
| [42 连续子数组的最大和](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题42LianXuZiShuZuDeZuiDaHeLcof.java) | 连续子数组的最大和                                           | 动态规划                                     |      |
| [43 1～n整数中1出现的次数](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题43OneNzhengShuZhong1chuXianDeCiShuLcof.java) | 输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次 | 数学 递归                                    |      |
| [44 数字序列中某一位的数字](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题44ShuZiXuLieZhongMouYiWeiDeShuZiLcof.java) | 以0123456789101112131415…的格式序列化，求任意第n位对应的数字 | 数学                                         |      |
| [45 把数组排成最小的数](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题45BaShuZuPaiChengZuiXiaoDeShuLcof.java) | 拼接数组中的数字，取最小                                     | 字符串数组排序                               |      |
| [46 把数字翻译成字符串](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题46BaShuZiFanYiChengZiFuChuanLcof.java) | 给定映射关系，计算一个数字有多少种不同的翻译方法             | 动态规划                                     |      |
| [47 礼物的最大价值](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题47LiWuDeZuiDaJieZhiLcof.java) | 二维数组，向右向下，求路径和最大值                           | 动态规划 递归                                |      |
| [48 最长不重复子字符串](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题48ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof.java) | 从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度 | 滑动窗口（双指针） 动态规划                  |      |
| [49 丑数](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题49ChouShuLcof.java) | 包含因子 2、3 和 5 的数称作丑数（Ugly Number），求从小到大的的第 n 个丑数 | 动态规划  Treeset                            |      |
| [50 第一次只出现一次的字符](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题50DiYiGeZhiChuXianYiCiDeZiFuLcof.java) | 字符串中第一次只出现一次的字符                               | 哈希表                                       |      |
| [51 数组中的逆序对](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题51ShuZuZhongDeNiXuDuiLcof.java) | 数组中逆序对的数量                                           | 归并排序                                     |      |
| [52 两个链表的第一个公共节点](P面试题52LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof.java) | 两个链表的第一个公共节点                                     | 链表基本操作                                 |      |
| [53I 排序数组中查找数字](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题53IZaiPaiXuShuZuZhongChaZhaoShuZiLcof.java) | 排序数组中查找数字                                           | 二分查找（左右边界）                         |      |
| [53II 0～n-1中缺失的数字](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题53IIQueShiDeShuZiLcof.java) | 0～n-1中缺失的数字                                           | 二分查找（右边界）                           |      |
| [54 二叉搜索树的第k大节点](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题54ErChaSouSuoShuDeDiKdaJieDianLcof.java) | 二叉搜索树的第k大节点                                        | 中序遍历改                                   |      |
| 55I  二叉树的深度                                            | 输入一棵二叉树的根节点，返回该树的深度                       | 树的深搜                                     |      |
| 55II 平衡二叉树                                              | 输入一棵二叉树的根节点，判断该树是不是平衡二叉树             | 树的深搜                                     |      |
| 56 数组中数字出现的次数                                      | 在一个数组 =中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。 | hashmap  位运算                              |      |
| 57 和为s的两个数字                                           | 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s | 字典 双指针                                  |      |
| 57II 和为s的连续正数序列                                     | 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数） | 双指针                                       |      |
| 58I 翻转单词顺序                                             | 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。 | 字符串基操                                   |      |
| 58II 左旋转字符串                                            | 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。 | 字符串基操                                   |      |
| 59 滑动窗口的最大值                                          | 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值. | 滑动窗口 大顶堆                              |      |
| 59II 队列的最大值                                            | 定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都O(1) | 维护一个递减的辅助队列                       |      |
| 60 n个骰子的点数                                             | 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率 | 动态规划                                     |      |
| 61 扑克牌中的顺子                                            | 从扑克牌中随机抽5张牌，判断是不是一个顺子                    | 数学                                         |      |
| [62圆圈中最后剩下的数字](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P面试题62YuanQuanZhongZuiHouShengXiaDeShuZiLcof.java) | 0~n个数组组成一个圆圈，每次删除第m个数，求最后剩下的数字     | 数学问题 约瑟夫环问题                        |      |
| 63 股票的最大利润                                            | 某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少 | 数学，动态规划                               |      |
| 64 求1+2+…+n                                                 | 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句 | 递归 利用&&或\|\|的短路特性                  |      |
| 65 不用加减乘除做加法                                        | 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号 | 位运算                                       |      |
| 66 构建乘积数组                                              | 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i +1]×…×A[n-1]。不能使用除法。 | 对称数组 正反遍历                            |      |
| 67 把字符串转换成整数                                        | 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用库函数 | 字符串操作                                   |      |
| 68I 二叉搜索树的最近公共祖先                                 | 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。   | 递归 树的遍历                                |      |
| 68II 二叉树的最近公共祖先                                    | 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。       | 递归 树的遍历                                |      |

---



## leetcode 前100

| Title-Link                 | Describe                                                     | Method             | Note |
| -------------------------- | ------------------------------------------------------------ | ------------------ | ---- |
| 1 两数之和                 | 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标 | 暴力搜索，哈希表   | 1    |
| 2 两数相加                 | 两个非空的链表用来表示两个非负的整数，各自的位数逆序存储，两个数相加起来，返回一个新的链表来表示它们的和 | 链表遍历，进位保留 | 2    |
| 3 无重复字符的最长字串     | 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度 | 双指针，哈希表，dp | 2    |
| 4 寻找两个有序数组的中位数 | 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2，找出这两个有序数组的中位数 | 二分法             | 3    |
|                            |                                                              |                    |      |
|                            |                                                              |                    |      |
|                            |                                                              |                    |      |
|                            |                                                              |                    |      |
|                            |                                                              |                    |      |
|                            |                                                              |                    |      |
|                            |                                                              |                    |      |

---



## 数组：

10_01 121 122 1013 1 2 3 4 15 

- 15 三数之和 排序 双指针
- 169 多数元素 哈希表
- 300 最长上升子序列 动态规划
- 11 盛水最多的容器 双指针
- 17 电话号码的字母组合 递归
- 31 下一个排列 数组 字典序
- 1160 拼写单词 数组 哈希表
- 945 使数组唯一的最小增量 
## 链表
- 19 删除链表倒数第N个节点 双指针
- 876 链表
## 栈
- 有效的括号 栈
---
## 字符串：

- 1071 字符串的最大公因子 辗转相除 
- 5 最长回文子串 中心扩展法 动态规划
- 01_06 字符串压缩 模拟过程 双指针
---

## 二叉树：
543 二叉树直径

---
## 哈希表与字符串：
3，49，76，187，290，409

---
## 搜索（DFS BFS 优先级队列）：
126，127，290，473，407，200 
994
- 695 岛屿的最大面积 深搜，广搜
- 22 括号生成 回溯
- 39 组合总和 回溯 剪枝
- 46 全排列 递归
- 365 水壶问题 DFS 数学
---
## 动态规划：
70，198，53，322，120，300，174
- 17_16 按摩师 动态规划
- 198 打家劫舍I
- 213 打家劫舍II
- 337 打家劫舍III
---
## 复杂数据结构：
208，211，547

208：前缀树，字典树

211：字典树，回溯

547：DFS，BFS，并查集，回溯

307：线段树

---
## 数学 
1103， 1103
- 892 三维形体的表面积


## leetcode 

| Title-Link                                                   | Describe                                                     | Method                                       | Note |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------------- | ---- |
| [820 单词的压缩编码](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P820ShortEncodingOfWords.java) | 对有公共后缀的字符串合并                                     | 字典树（后缀版） Hashset去重                 |      |
| [1162 地图分析](https://github.com/livinglh/leetcode_record/blob/master/src/leetcode/editor/cn/P1162AsFarFromLandAsPossible.java) | 二维数组，0为海洋，1为陆地，寻找距离陆地最远的海洋，返回最远距离 | BFS，多源BFS                                 |      |
| 912 排序数组                                                 | 数组排序                                                     | 多种排序方法                                 |      |
| 1111 有效括号的嵌套深度                                      | 给你一个有效括号字符串 seq，将其分成两个不相交的子序列 A 和 B，且 A 和 B 满足有效括号字符串的定义 | 找规律                                       |      |
| 289 生命游戏                                                 | 细胞生存状态转化                                             | 暴力解就完事                                 |      |
| 42 接雨水                                                    | 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水 | 逐个遍历 动态规划 双指针 单调栈 以最大值分界 | 3    |
| 460 LFU缓存                                                  | 设计并实现最不经常使用（LFU）缓存的数据结构                  | 复杂数据结构                                 | 3    |
| 01_07                                                        | 旋转矩阵                                                     | 矩阵操作                                     | 2    |
| 542 01矩阵                                                   | 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。 | 多源BFS，动态规划                            | 2    |
| 54 合并区间                                                  | 给出一个区间的集合，请合并所有重叠的区间                     | 排序，合并                                   | 2    |
| 466 统计重复个数                                             | Ra = ["acb", 4] ，其实就是 Sa = "acb", Ra = "acbacbacbacb", Na = 4；而 Rb = ["ab", 2]，其实就是 Sb = "ab", Rb = "abab", Nb = 2；Rb 重复 M 次后，仍然能够 从 Ra 中获得，求 M 的最大取值。 | 找出循环节                                   | 3    |
| 1248 统计「优美子数组」                                      | 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。返回这个数组中「优美子数组」的数目。 | 双指针，前缀和                               | 2    |
| 199 二叉树的右视图                                           | 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值 | 层序遍历                                     | 2    |
| 面试题 08.11. 硬币                                           | 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007) | 动态规划                                     | 2    |
| 23  合并 k 个排序链表                                        | 合并 k 个排序链表，返回合并后的排序链表                      | 堆，分治                                     | 3    |
| 1095 山脉数组中查找目标值                                    | 给你一个 山脉数组 mountainArr，请你返回能够使得 mountainArr.get(index) 等于 target 最小 的下标 index | 二分                                         | 3    |
| 98 验证二叉搜索树                                            | 给定一个二叉树，判断其是否是一个有效的二叉搜索树。           | 中序，递归                                   | 2    |
| 983 最低票价                                                 | 火车票的最优购买方案                                         | 动态规划                                     | 2    |
| 508 出现次数最多的子树元素和                                 | 给你一个二叉树的根结点，请你找出出现次数最多的子树元素和     | 二叉树，递归                                 | 2    |
| 572 另一个树的子树                                           | 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树 | 二叉树，递归                                 | 1    |
| 221 最大正方形                                               | 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。 | 动态规划                                     | 2    |
| 84 柱状图中最大的矩形                                        | 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 | 单调栈                                       | 3    |





