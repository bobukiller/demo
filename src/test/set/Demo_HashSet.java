package test.set;

import java.util.HashSet;

public class Demo_HashSet {
    public static void main(String[] args) {

        HashSet<test.set.Student> hs = new HashSet<>();

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);


        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);


    }
}
