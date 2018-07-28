package chapter10.demo1028;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 13, 5, 9, 7, 11, 3};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+"、"+arr[i]);
        }
        System.out.println("-----------");
        System.out.println(Arrays.binarySearch(arr,9));
    }
}
