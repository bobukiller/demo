package test.demo13;

import java.util.TreeMap;

public class DemoTreeMap2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan", 23);
        Student s4 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        tm.put(s1, "北京");
        tm.put(s2, "上海");
        tm.put(s3, "广州");
        tm.put(s4, "广州");

        System.out.println(tm);

    }
}
