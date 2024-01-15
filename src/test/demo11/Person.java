package test.demo11;

public class Person {
    private String name;
    private int age;

//    public void keepPet(Dog dog, String something) {
//        System.out.println("年龄为" + age + "的" + name + "养了一条" + dog.getColor() + "的" + dog.getAge() + "岁的的狗");
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat, String something) {
//        System.out.println("年龄为" + age + "的" + name + "养了一只" + cat.getColor() + "的" + cat.getAge() + "岁的的猫");
//        cat.eat(something);
//    }

        public void keepPet(Animal a, String something) {
        if (a instanceof Dog d){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的的狗");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的的猫");
            c.eat(something);

        }
        else {
            System.out.println("没有这种动物");
        }
        }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
