package test.demo13;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
//        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
//        BigInteger b = new BigInteger("10",2);
        Integer i1 = 10;
        Integer i2 = 10;
        int i3 = i2 + i1;
        System.out.println(i3);
        Character i  = 37;
        System.out.println(i);


    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
