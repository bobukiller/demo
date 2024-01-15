package test.demo13;

import java.util.Comparator;
import java.util.TreeMap;

public class DemoTreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });

        tm.put(3,"牙膏");
        tm.put(1,"牙刷");
        tm.put(2,"牙杯");

//        Set<Integer> id = tm.keySet();
//        tm.comparator();
        System.out.println(tm);
    }
}
