package test.demo5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String user = "user";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 3; i > 0; i--) {

            System.out.println("请输入你的用户：");
            String name = sc.next();

            System.out.println("请输入你的密码：");
            String pass = sc.next();

            if (user.equals(name) && password.equals(pass)) {
                System.out.println("登录成功！");
            } else {
                if (i - 1 == 0) {
                    System.out.println("你的账户被锁定！");
                } else {
                    System.out.println("用户名或者密码错误！你还有" + (i - 1) + "次机会!");
                }
            }
        }
    }
}
