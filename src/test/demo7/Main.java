package test.demo7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(Student student : list){
            System.out.println(student.getName() + ", " +student.getAge());
        }
    }
}
