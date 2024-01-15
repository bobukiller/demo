package test.demo13;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("zhangsan");
        c.add("lisi");
        c.add("wangwu");

        // 迭代器循环遍历
        for (String s : c) {
            System.out.println(s);
        }

//        // lambda表达式遍历 匿名内部类形式
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // lambda表达式遍历
        c.forEach(System.out::println);


    }
}
