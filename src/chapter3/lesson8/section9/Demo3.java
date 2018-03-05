package chapter3.lesson8.section9;

public class Demo3 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="HELLO";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
