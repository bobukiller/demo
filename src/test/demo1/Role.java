package test.demo1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void fight(Role role){
        Random  rs = new Random();
        int hurt = rs.nextInt(20) + 1;
        int newBlood = role.getBlood() < hurt ? 0 :role.getBlood() - hurt;
        role.setBlood(newBlood);

        System.out.println(this.getName() + "打了" + role.getName() +"一拳，" + "造成了" + hurt +"点伤害,"+
        role.getName()+"还剩下" + role.getBlood() +"滴血。");
    }
}
