package chapter4.demo421;

public class Demo {
    public static void main(String[] args) {
        Array arr=new Array(6);
        arr.add(10);
        arr.add(30);
        arr.add(40);
        arr.add(80);
        arr.add(60);
        arr.add(50);
        arr.add(20);
        for (int i: arr.getData()) {
            System.out.println(i);
        }

        System.out.println("-------SortArray----------------");
        SortArray arr1=new SortArray(6);
        arr1.add(10);
        arr1.add(30);
        arr1.add(40);
        arr1.add(80);
        arr1.add(60);
        arr1.add(50);
        arr1.add(20);
        for (int i: arr1.getData()) {
            System.out.println(i);
        }

        System.out.println("---------------reverseArray-------------------");
        ReverseArray arr2=new ReverseArray(5);
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        arr2.add(40);
        arr2.add(50);
        for (int item:arr2.getDate()) {
            System.out.println(item);
        }


    }
}
