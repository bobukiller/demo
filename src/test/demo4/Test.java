package test.demo4;

public class Test {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend g1 = new GirlFriend("小美",18,'女',"绘画");
        GirlFriend g2 = new GirlFriend("小珠",21,'女',"唱歌");
        GirlFriend g3 = new GirlFriend("小诗诗",19,'女',"打篮球");
        GirlFriend g4 = new GirlFriend("小只因",23,'女',"rap")
                ;
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for(GirlFriend girlFriend: arr){
            sum += girlFriend.getAge();
        }

        int avg = sum/arr.length;
        System.out.println("她们平均年龄为：" + avg);

        int num = 0;
        System.out.println("小于平均年龄有");
        for(GirlFriend girlFriend: arr){
            if(girlFriend.getAge() < avg){
                num += 1;
                System.out.println(girlFriend.getName()+" "+girlFriend.getAge()+" "+girlFriend.getGender()+" "+girlFriend.getHobby());
            }
        }
        System.out.println("一共"+num+"个" );


    }
}
