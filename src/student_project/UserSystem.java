package student_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 忘记密码");
            System.out.println("4. 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String option = sc.next();
            switch (option) {
                case "1": {
                    login(list);
                    break;
                }
                case "2": {
                    register(list);
                    break;
                }
                case "3": {
                    forgetPassword(list);
                    break;
                }
                case "4": {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("没有这个选项！");
                    break;
                }
            }
        }

    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int i = getIndex(list, username);
        if (i >= 0) {
            for (int j = 3; j >= 0; j--) {
                System.out.println("请输入你的密码：");
                String password = sc.next();
                while (true) {
                    String rightCode = getCode();
                    System.out.println("当前验证码为：" + rightCode);
                    System.out.println("请输入验证码：");
                    String code = sc.next();
                    if(code.equalsIgnoreCase(rightCode)){
                        System.out.println("验证码正确");
                        break;
                    }
                    else{
                        System.out.println("验证码错误，请重新输入");
                    }
                }

                if (password.equals(list.get(i).getPassword())) {
                    System.out.println("登录成功");
                    StudentSystem.studentSystem();
                    break;
                }

                else if(j == 0){
                    System.out.println("该用户被锁定，联系管理员解锁");
                }
                else {
                    System.out.println("密码错误，请重新输入，你还有" + j + "次机会");
                }
            }

        } else {
            System.out.println("用户名" + username + "未注册，请先注册");
        }

    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        String ID;
        String phone;
        while (true) {
            System.out.println("请输入设置的用户名：");
            username = sc.next();
            int len = username.length();
            if (len > 15 || len < 3) {
                System.out.println("用户名长度为3~15之间，请重新输入");
            } else {
                int num = 0;
                int pass = 1; // 设置通道判断，为1进行放行
                for (int i = 0; i < len; i++) {
                    char[] c = username.toCharArray();
                    if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] >= '0' && c[i] <= '9') {
                        if (c[i] >= '0' && c[i] <= '9') {
                            ++num;
                        }
                    } else {
                        System.out.println("用户名类型必须为数字和字母，请重新输入");
                        pass = -1;
                        break;
                    }
                }
                if (pass == 1) {
                    boolean result = contain(list, username);
                    if (result) {
                        System.out.println("用户名已经存在,请重新输入");
                    } else if (num == 0 || num == len) {
                        System.out.println("用户名包含数字和字母的组合，请重新输入");
                    } else {
                        break;
                    }
                }
            }
        } //用户名校验
        while (true) {
            System.out.println("请输入设置的密码：");
            password = sc.next();
            if (password.length() > 18) {
                System.out.println("密码最大长度为18，请重新输入");
            } else {
                System.out.println("请再次输入密码：");
                String passwordT = sc.next(); //校验密码
                if (passwordT.equals(password)) {
                    System.out.println("密码设置成功");
                    break;
                } else {
                    System.out.println("两次输入的密码不一致请重新输入");
                }
            }
        } //用户密码校验
        while (true) {
            int pass = 0;
            System.out.println("请输入你的身份证号码：");
            ID = sc.next();
            if (ID.length() == 18) {
                if (ID.charAt(0) == '0') {
                    System.out.println("身份证号码不能以0开头，请重新输入");
                } else {
                    char[] c = ID.toCharArray();
                    for (int i = 0; i < c.length - 1; i++) {
                        if (c[i] >= '0' && c[i] <= '9') {
                            pass = 1;
                        } else {
                            System.out.println("身份证号码前17位都是数字，请重新输入");
                            pass = -1;
                            break;
                        }

                    }
                    if (pass == 1) {
                        char last = c[c.length - 1];
                        if (last >= '0' && last <= '9' || last == 'x' || last == 'X') {
                            break;
                        } else {
                            System.out.println("身份证号码最后一位应为数字或者大小写X，请重新输入");
                        }
                    }
                }
            } else {
                System.out.println("身份证号码为18位，请重新输入");
            }
        } //用户身份证校验
        while (true) {
            int pass = 0;
            System.out.println("请输入你的手机号码：");
            phone = sc.next();
            if (phone.length() == 11) {
                if (phone.charAt(0) == '0') {
                    System.out.println("手机号码不能以0开头，请重新输入");
                } else {
                    char[] c = phone.toCharArray();
                    for (int i = 1; i < c.length; i++) {
                        if (c[i] >= '0' && c[i] <= '9') {
                            pass = 1;
                        } else {
                            System.out.println("手机号码只能为数字，请重新输入");
                            pass = -1;
                            break;
                        }
                    }
                    if (pass == 1) {
                        System.out.println("注册成功");
                        break;
                    }
                }
            } else {
                System.out.println("手机号码为11位，请重新输入");
            }
        } //用户手机号码校验
        User u = new User(username, password, ID, phone);
        list.add(u);

    }

    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        int i = getIndex(list, username);
        if (i >= 0) {
            System.out.println("输入身份证号码：");
            String ID = sc.next();
            System.out.println("输入手机号码：");
            String phone = sc.next();
            if (ID.equals(list.get(i).getID()) && phone.equals(list.get(i).getPhone())) {
                while (true) {
                    System.out.println("请输入新密码：");
                    String password = sc.next();
                    System.out.println("请再次输入密码：");
                    String passwordT = sc.next();
                    if(password.equals(passwordT)){
                        list.get(i).setPassword(password);
                        System.out.println("修改密码成功");
                        break;
                    }
                    else{
                        System.out.println("两次输入密码不一致，请重新输入");
                    }
                }

            } else {
                System.out.println("账号信息不匹配，修改失败");
            }
        } else {
            System.out.println("用户名为注册");
        }
    }


    public static boolean contain(ArrayList<User> list, String username) {
        return getIndex(list, username) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i).getUsername())) {
                return i;
            }
        }
        return -1;
    }

    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int number = r.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }//获取验证码
}
