package test.demo13;

import java.util.*;

public class DemoMap4 {
    public static void main(String[] args) {

        //定义一个数组，存储四个景点
        String[] arr = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并且把投票结果存储起来
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
//            System.out.println(arr[index]);
            list.add(arr[index]);
        }

        //统计数量较多不适应于计数器思想（利用map进行统计）
        HashMap<String,Integer> map = new HashMap<>();
        for (String name : list) {
            if(map.containsKey(name)){
                //存在
                //先获取当前景点已经被投票的次数
                Integer count = map.get(name);
                count++;
                //把新的次数添加到集合中
                map.put(name,count);
            }
            else{
                //不存在
                map.put(name,1);
            }
        }
        System.out.println(map);

        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(max < entry.getValue()){
                max = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            if(max == entry.getValue()){
                System.out.println("投票人数最多的景点：" + entry.getKey());
            }
        }


    }
}
