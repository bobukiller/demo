package test.set;

import test.demo13.Student;

public class Demo_HashCode {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s4 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

         //计算哈希值
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
    }
}
