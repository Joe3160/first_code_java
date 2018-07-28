package chapter10.demo1017;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] result = new int[7];
        int count=0;
        for (int i = 0; i < 7; i++) {
            while (count<7){
                int value=random.nextInt(36)+1;
                if (!array_value_exist(result, value)) {
                    result[count++]=value;
                }
            }
        }
        Arrays.sort(result);
        for (int item:result ) {
            System.out.println(item);
        }

    }



    public static boolean array_value_exist(int[] arr, int value) {
        if (null == arr) {
            return true;
        }
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static int array_rand_value(int[] arr){
        Random random=new Random();
        int key=random.nextInt(arr.length);
        return arr[key];
    }
}
