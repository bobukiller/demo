package test.demo5;

import java.util.Scanner;
import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            System.out.println("请输入一个字符串");
            str = sc.next();

            if(checkStr(str)){
                break;
            }
            else{
                System.out.println("输入有误！请重新输入");
                System.out.println();
            }

        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            sj.add(changeLuoMa(number));
        }

        System.out.println("该字符串对应的罗马字符为：" + sj);
    }

//    Ⅰ、Ⅱ、Ⅲ、Ⅳ（IIII）、Ⅴ、Ⅵ、Ⅶ、Ⅷ、Ⅸ
    public static String changeLuoMa(int number){
        String[] arr =  {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};

        return arr[number];
    }

    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c < '0' || c > '9'){
                    return false;
                }
            }
            return true;
        }
    }
}

