package test.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo_TreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(5);
        ts.add(4);

        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------");
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("----------------------");
        ts.forEach( i -> System.out.println(i));

    }
}
