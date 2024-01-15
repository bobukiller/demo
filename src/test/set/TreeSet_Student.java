package test.set;

public class TreeSet_Student implements Comparable<TreeSet_Student>{
    private String name;
    private int age;
    private int ChineseCore;
    private int mathCore;
    private int EnglishCore;

    public TreeSet_Student() {
    }

    public TreeSet_Student(String name, int age, int ChineseCore, int mathCore, int EnglishCore) {
        this.name = name;
        this.age = age;
        this.ChineseCore = ChineseCore;
        this.mathCore = mathCore;
        this.EnglishCore = EnglishCore;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return ChineseCore
     */
    public int getChineseCore() {
        return ChineseCore;
    }

    /**
     * 设置
     * @param ChineseCore
     */
    public void setChineseCore(int ChineseCore) {
        this.ChineseCore = ChineseCore;
    }

    /**
     * 获取
     * @return mathCore
     */
    public int getMathCore() {
        return mathCore;
    }

    /**
     * 设置
     * @param mathCore
     */
    public void setMathCore(int mathCore) {
        this.mathCore = mathCore;
    }

    /**
     * 获取
     * @return EnglishCore
     */
    public int getEnglishCore() {
        return EnglishCore;
    }

    /**
     * 设置
     * @param EnglishCore
     */
    public void setEnglishCore(int EnglishCore) {
        this.EnglishCore = EnglishCore;
    }

    public String toString() {
        return "TreeSet_Student{name = " + name + ", age = " + age + ", ChineseCore = " + ChineseCore + ", mathCore = " + mathCore + ", EnglishCore = " + EnglishCore + "}";
    }


    @Override
    public int compareTo(TreeSet_Student o) {
        int this_core = this.getChineseCore() + this.getMathCore() + this.getEnglishCore();
        int o_core = o.getChineseCore() + o.getMathCore() + o.getEnglishCore();
        int compare = o_core - this_core;
        compare = compare ==0 ? o.getChineseCore() - this.getChineseCore() : compare;
        compare = compare ==0 ? o.getMathCore() - this.getMathCore() : compare;
        //可以省略比较英语（总分不一样)
        compare = compare ==0 ? o.getEnglishCore() - this.getEnglishCore() : compare;
        compare = compare ==0 ? o.getAge() - this.getAge() : compare;
        compare = compare ==0 ? o.getName().compareTo(this.getName()): compare;

        return compare;


    }
}
