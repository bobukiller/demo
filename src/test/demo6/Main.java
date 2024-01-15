package test.demo6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        while (true){
            System.out.println("请输出两个长度相同的字符串");
            System.out.println("第一个字符串：");
            str1 = sc.next();
            System.out.println("第二个字符串：");
            str2 = sc.next();
            if(str1.length() == str2.length()){
                break;
            }
            else {
                System.out.println("输入字符串长度不同,请重新输入！");
            }
        }

        if(judgeString(str1, str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }


    public static String setString(String str){
        String[] arr =  str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        sb.append(arr[0]);
        return sb.toString();
    }
    public static boolean judgeString(String str1, String str2){
        for (int i = 0; i < str1.length(); i++) {
            str1 = setString(str1);
            if (str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
}
