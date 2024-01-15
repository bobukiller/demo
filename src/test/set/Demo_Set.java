package test.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo_Set {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");

//        System.out.println(s);

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------------------");
        //增强for
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println("--------------------------------");
        //lambda表达式遍历
        s.forEach(s1 -> System.out.println(s1));
    }
}
