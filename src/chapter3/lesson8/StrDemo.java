package chapter3.lesson8;

public class StrDemo {
    public static void main(String[] args) {
        String str1=null;
        //NullPointerException
        //if (str1.equals("Hello")) {
        //    System.out.println("str1 is Hello");
        //}

        //规避NullPointerException
        if ("Hello".equals(str1)) {
            System.out.println("str1 is Hello");
        } else {
            System.out.println(str1);
        }



    }
}
