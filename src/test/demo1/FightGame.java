package test.demo1;

public class FightGame {
    public static void main(String[] args) {
        Role r1 = new Role();
        Role r2 = new Role();

        r1.setName("张三");
        r2.setName("李四");

        r1.setBlood(100);
        r2.setBlood(100);

        System.out.println("比赛开始");
        while (true){
            r1.fight(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+ "KO了" + r2.getName());
                System.out.println("比赛结束");
                break;
            }
            r2.fight(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+ "KO了" + r1.getName());
                System.out.println("比赛结束");
                break;
            }
        }
    }
}
