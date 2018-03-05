package chapter3.lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1=new int[]{0,1,2,3,4,5,6};
        int[] arr2=new int[]{11,22,33,44,55,66};

        //Integer arr3[] = { 1, 2, 3, 4, 5, 6, 7 };
        //dump(arr3);

        print(arr1);
        print(arr2);
        System.out.println("------------数组的复制--------------------");
        System.arraycopy(arr1,1,arr2,2,3);
        print(arr1);
        print(arr2);


        System.out.println("------数组的排序-------------");
        //数组的排序
        int[] arr4=new int[]{0,8,2,4,3,1};
        print(arr4);
        Arrays.sort(arr4);
        print(arr4);





    }

    public static <T> void dump(T var[]){
        for (T t: var) {
            System.out.println(t);
        }
    }

    public static void print(int arr[]){
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();

    }


}
