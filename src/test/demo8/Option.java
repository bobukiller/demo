package test.demo8;

import java.util.ArrayList;
import java.util.Scanner;

public class Option {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("123","张三","12345678");
        User u2 = new User("234","李四","12345678");
        User u3 = new User("345","王五","1234qwer");
        list.add(u1);
        list.add(u2);
        list.add(u3);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查询的用户id:");
        String id = sc.next();

        System.out.println(searchUser(id,list));

    }
    public static boolean searchUser(String id, ArrayList<User> list){
//        for (User user : list){
//            if(user.getId().equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(id, list) >= 0;
    }
    public static int getIndex(String id, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
