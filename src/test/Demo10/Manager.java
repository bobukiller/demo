package test.Demo10;

public class Manager extends Staff{
        private int bonus;

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String StaffID, String name, int salary, int bonus) {
        super(StaffID, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    @Override
    public void work() {
        System.out.println("管理其他职工人员");
    }
}
