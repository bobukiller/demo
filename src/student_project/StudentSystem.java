package student_project;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void studentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {

            menu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            optionResult(option, list);
        }
    }


    public static void menu() {
        System.out.println("----------欢迎来到学生管理系统--------------");
        System.out.println("1. 添加学生信息");
        System.out.println("2. 删除学生信息");
        System.out.println("3. 修改学生信息");
        System.out.println("4. 查询学生信息");
        System.out.println("5. 退出");
        System.out.println("请输入你的选择：");
    }

    public static void optionResult(int option, ArrayList<Student> list) {
        switch (option) {
            case 1: {
                addStudent(list);
                break;
            }
            case 2: {
                deleteStudent(list);
                break;
            }
            case 3: {
                edictStudent(list);
                break;
            }
            case 4: {
                searchStudent(list);
                break;
            }
            case 5: {
                exit();
                System.exit(0);
                break;
            }
            default:
                System.out.println("没有这个选项！！");
                break;
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Student s;
        Scanner sc = new Scanner(System.in);

        String id;
        while (true) {
            System.out.println("请输入学生的id：");
            id = sc.next();
            if (checkId(list, id)) {
                System.out.println("该id已经存在，请重新输入!");
            } else {
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的家庭住址：");
        String address = sc.next();

        s = new Student(id, name, age, address);
        list.add(s);

        System.out.println("学生信息添加成功！");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(list.get(index));
            System.out.println("id为" + id + "的学生信息删除成功！");
        } else {
            System.out.println("当前id不存在,删除失败");
        }
    }

    public static void edictStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改学生信息的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            System.out.println("姓名修改为：");
            String name = sc.next();
            list.get(index).setName(name);
            System.out.println("年龄修改为：");
            int age = sc.nextInt();
            list.get(index).setAge(age);
            System.out.println("地址修改为：");
            String address = sc.next();
            list.get(index).setAddress(address);

            System.out.println("修改学生信息成功");
        } else {
            System.out.println("需要修改学生信息id：" + id + "不存在，请重新输入");
        }
    }

    public static void searchStudent(ArrayList<Student> list) {

        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
            for (Student student : list) {
                System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAddress());
            }
        }
    }

    public static void exit() {
        System.out.println("退出成功！");
    }

    public static boolean checkId(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }
}


