package test.demo3;

public class Main {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("华为",5999.9,"黑色");
        Phone p2 = new Phone("小米",3999.9,"白色");
        Phone p3 = new Phone("三星",7999.9,"红色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sumOfPrice = 0;
        for(Phone phone: arr){
            sumOfPrice += phone.getPrice();
        }
        System.out.println("三部手机的平均价格为：" + sumOfPrice/arr.length);

    }
}
