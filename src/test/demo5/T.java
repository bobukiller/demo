package test.demo5;

import java.util.StringJoiner;

public class T {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[","]");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        System.out.println(sj.toString());
    }
}
