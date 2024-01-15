package test.demo6;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abcd";

        System.out.println(check(str1, str2));
    }
    public static String rotate(String str){
        char[] arr = str.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = arr[0];

        return new String(arr);
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
