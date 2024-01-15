package test.demo13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("令狐冲", "东方不败");

        Set<String> keys = map.keySet();

//        // 增强for遍历
//        for (String key : keys) {
//            String value = map.get(key);
//            System.out.println(key + "+" + value);
//        }

//        // lambda表示式遍历
//        keys.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                String value = map.get(s);
//                System.out.println(s + "+" + value);
//            }
//        });

        // 迭代器遍历
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+"+"+map.get(key));
        }

    }
}
