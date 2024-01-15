package test.Demo10;

public class Staff {
    private String StaffID;
    private String name;
    private int salary;

    public Staff() {
    }

    public Staff(String StaffID, String name, int salary) {
        this.StaffID = StaffID;
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println("正在工作");
    }
    public void eat(){
        System.out.println("正在吃米饭");
    }

    /**
     * 获取
     * @return StaffID
     */
    public String getStaffID() {
        return StaffID;
    }

    /**
     * 设置
     * @param StaffID
     */
    public void setStaffID(String StaffID) {
        this.StaffID = StaffID;
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
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Staff{StaffID = " + StaffID + ", name = " + name + ", salary = " + salary + "}";
    }
}
