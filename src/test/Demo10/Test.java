package test.Demo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("123", "张三", 5000, 800);
        System.out.println(m.getStaffID()+ ", "+ m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        Chef c = new Chef();
        c.setStaffID("234");
        c.setName("李四");
        c.setSalary(3000);
        System.out.println(c.getStaffID() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
