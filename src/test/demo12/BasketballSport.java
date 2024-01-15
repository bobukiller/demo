package test.demo12;

public class BasketballSport extends Sportsman{
    public BasketballSport() {
    }

    public BasketballSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("运动员在学打篮球");
    }
}
