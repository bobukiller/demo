package game;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        int[][] data = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            data[i/4][i%4] = arr[i];
        }

        for(int[] a: data){
            System.out.println(Arrays.toString(a));
        }
    }
}
