package 笔试题.华为7_29;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> map = new HashMap<>();  // key: 结构题名称 value：该结构体内所含结构体列表
        Map<String, Integer> memo = new HashMap<>();  // 记录需要计算的结构题
        String start;
        while(true){
            String s = sc.nextLine();
            String[] sleft = s.split("\\(");
            String[] skong = s.split(" ");
            if(sleft[0].equals("sizeof")){
                start = sleft[1].split("\\)")[0];
                break;
            }else if(skong[0].equals("struct")){
                String keystring = skong[1];
                List<String> value = new ArrayList<>();
                while(true){
                    String seach = sc.nextLine();
                    if(seach.equals("};")){
                        break;
                    }
                    String[] sseach = seach.split(" ");
                    if(sseach[4].equals("struct")){
                        value.add(sseach[5]);
                    }else{
                        value.add(sseach[4]);
                    }
                }
                map.put(keystring, value);
            }
        }


        int ans = DFS(map, memo, start);
        System.out.println(ans);
    }
    // memo备忘录，同时解决循环依赖问题
    public static int DFS(Map<String, List<String>> map, Map<String, Integer> memo, String s){
        if(s.equals("char")) return 1;
        if(s.equals("short")) return 2;
        if(s.equals("long")) return 4;
        if(!map.containsKey(s)) return 0;
        if(memo.containsKey(s)){
            if(memo.get(s) != -1){
                return memo.get(s);
            }else{
                return 0;
            }
        }
        memo.put(s, -1);
        List<String> slist = map.get(s);
        int res = 0;
        for(String sl : slist){
            int r = DFS(map, memo, sl);
            if(r == 0) return 0;
            res += r;
        }
        memo.put(s, res);
        return res;
    }
}

/*
struct s1 {
    short a;
    long b;
    char c;
    struct s2 d;
};
struct s2 {
    short a;
    long b;
    char c;
    struct s3 d;
};
struct s3 {
    short a;
    long b;
    char c;
    struct s1 d;
};
sizeof(s3);
 */
