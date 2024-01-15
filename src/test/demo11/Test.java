package test.demo11;

public class Test {
    public static void main(String[] args) {
//        Dog d = new Dog(2, "黑色");
//        Cat c = new Cat(3, "灰颜色");
//        Person p1 = new Person("老王", 30);
//        Person p2 = new Person("老李", 25);
//
//
//        p1.keepPet(d, "骨头");
//        System.out.println();
//        p2.keepPet(c, "鱼");
        Person p1 = new Person("老王", 30);
        Dog d = new Dog(2, "黑色");
        Cat c = new Cat(3, "灰颜色");
        p1.keepPet(d,"骨头");
        p1.keepPet(c, "鱼");
    }
}
