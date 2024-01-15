package test.demo13;

public class Demo {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程";

        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }

}
