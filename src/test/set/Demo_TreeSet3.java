package test.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo_TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len = o1.length() - o2.length();
                return len == 0? o1.compareTo(o2) : len;
            }
        });

        ts.add("a");
        ts.add("vfg");
        ts.add("tghd");
        ts.add("sdgdqq");

        System.out.println(ts);
    }
}
