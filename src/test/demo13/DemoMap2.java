package test.demo13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("令狐冲", "东方不败");

        Set<Map.Entry<String, String>> entries = map.entrySet();

//        // 增强for遍历
//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+"+"+value);
//        }

//        // lambda表达式遍历
//        entries.forEach(new Consumer<Map.Entry<String, String>>() {
//            @Override
//            public void accept(Map.Entry<String, String> entry) {
//                System.out.println(entry.getKey() + "+" + entry.getValue());
//            }
//        });

        // 迭代器遍历
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "+" + entry.getValue());
        }
    }
}
