package test.Demo10;

public class Chef extends Staff{
    public Chef() {
    }

    public Chef(String StaffID, String name, int salary) {
        super(StaffID, name, salary);
    }

    @Override
    public void work() {
        System.out.println("进行炒菜");
    }
}
