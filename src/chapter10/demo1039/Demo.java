package chapter10.demo1039;

public class Demo {
    public static void main(String[] args) {
        String str="123.6780";
        String regex="^\\d+(\\.\\d+)?$";
        if (str.matches(regex)) {
            double d=Double.parseDouble(str);
            System.out.println(d);
        }
    }
}
