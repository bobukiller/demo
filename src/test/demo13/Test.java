package test.demo13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // 17685281481
//        String regex1 = "1[3-9]\\d{9}";
//        System.out.println("17685281481".matches(regex1));
//        System.out.println("12685281481".matches(regex1));


        String str = "--sd!15186317838" +
                "sdh-java2" +
                "assajd java" +
                "jsdprjavaSE";

        String regex = "(1[3-9]\\d{9})|(java[A-Z\\d]{0,2})";

        Pattern p =  Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }
}
