package test.demo11;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    public void eat(String something) {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "的猫" + "眯着眼侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "的猫" + "抓老鼠");
    }
}
