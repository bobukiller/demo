package test.demo2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car[] arr = new Car[3];

        for(int i = 0; i < arr.length;i++){
            Car car = new Car();
            int num = i+1;
            System.out.println("please input NO."+ num + " "+ "car's information:");
            System.out.println("the NO."+ num + " "+ "car's brand:");
            String brand = s.next();
            car.setBrand(brand);
            System.out.println("the NO."+ num + " "+ "car's price:");
            double price = s.nextDouble();
            car.setPrice(price);
            System.out.println("the NO."+ num + " "+ "car's color:");
            String color = s.next();
            car.setColor(color);
            arr[i] = car;
        }
        for(Car car : arr ){
            System.out.println(car.getBrand()+" "+car.getPrice()+" "+car.getColor());
        }

    }



}
