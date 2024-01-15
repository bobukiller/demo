package test.demo13;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("zhangsan",23);
        lhm.put("lisi",24);
        lhm.put("wangwu",25);
        lhm.put("zhangsan",24);
        System.out.println(lhm);

    }
}
