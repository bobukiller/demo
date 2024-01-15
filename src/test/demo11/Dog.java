package test.demo11;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something) {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "的狗" + "两条前腿死死抱着" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "的狗" + "看家");
    }


}
