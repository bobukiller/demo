package test.demo13;

public class AllTest {
    public static void main(String[] args) {
//        Collection<Integer> c = new ArrayList<>();
//        int sum = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        while (sum <= 200){
//            System.out.println("请输入1~100之间的整数:");
//            String input = sc.nextLine();
//            int i = Integer.parseInt(input);
//            if(i <= 100 && i > 0){
//                sum += i;
//                c.add(i);
//            }
//            else{
//                System.out.println("输入有误范围，请重新输入！");
//
//            }
//        }
//        c.forEach(System.out::println);

        String s = "1234567";
        int i = toInt(s);
        System.out.println(i);





    }

    private static int  toInt(String s) {
        int number = 0;
        if(!s.matches("([1-9]\\d{0,9})")){
            System.out.println("数据有误");
        }else {
            for (int i = 0; i < s.length(); i++) {
                char zero = '0';
                int c = s.charAt(i) - '0';

                number = number * 10 + c;
            }

        }
        return number;
    }


}
