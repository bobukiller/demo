package test.set;

import java.util.TreeSet;

public class Demo_all_TreeSet {
    public static void main(String[] args) {
        TreeSet_Student tss1 = new TreeSet_Student("张三",23,90,80,75);
        TreeSet_Student tss2 = new TreeSet_Student("李四",24,74,95,84);
        TreeSet_Student tss3 = new TreeSet_Student("王五",25,82,79,60);
        TreeSet_Student tss4 = new TreeSet_Student("赵六",26,90,62,75);
        TreeSet_Student tss5 = new TreeSet_Student("老七",27,92,93,95);

        TreeSet<TreeSet_Student> ts = new TreeSet<>();
        ts.add(tss1);
        ts.add(tss2);
        ts.add(tss3);
        ts.add(tss4);
        ts.add(tss5);

        for (TreeSet_Student t : ts) {
            System.out.println(t);
        }
    }
}
