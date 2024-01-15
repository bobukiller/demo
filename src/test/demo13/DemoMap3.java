package test.demo13;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap3 {
    public static void main(String[] args) {
        //创建HashMap的对象
        HashMap<Student,String> map = new HashMap<>();
        //创建三个学生的对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("王五",25);

        //添加元素
        map.put(s1,"北京");
        map.put(s2,"上海");
        map.put(s3,"广州");
        map.put(s4,"江苏");

        //键找值遍历
        Set<Student> keys = map.keySet();
        for(Student key : keys){
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------------------------------------");

        //实体对象遍历
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);

        }
        System.out.println("---------------------------------------");

        //lambda表达式遍历
        map.forEach((student, s) -> System.out.println(student + "=" + s));

        System.out.println("---------------------------------------");
        System.out.println(map);


    }
}
