package chapter3.lesson6;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] data=new int[]{0,1,2,3};
        int[] temp=data;
        for (int i = 0; i <temp.length ; i++) {
            System.out.println(temp[i]);
        }

    }
}
