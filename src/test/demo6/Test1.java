package test.demo6;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(",");
            } else {
                System.out.print("]");
            }
        }
    }
}
