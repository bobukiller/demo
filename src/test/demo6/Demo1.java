package test.demo6;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "caa";

        System.out.println(check(str1, str2));
    }
    public static String rotate(String str){
        char end = str.charAt(0);
        String first = str.substring(1);
        return first + end;
    }
    public static boolean check(String str1, String str2){
        for (int i = 0; i < str1.length(); i++) {
            String str = rotate(str1);
            if(str.equals(str2)){
                return true;
            }
        }
        return false;
    }

}

