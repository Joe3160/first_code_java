package chapter3.lesson8.section9;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(isNumber("abc"));
        System.out.println(isNumber("456"));

    }

    public static boolean isNumber(String str){
        boolean flag=false;
        if (str == null || str.length() <= 0) {
            return flag;
        }

        char[] data=str.toCharArray();
        for (char c : data) {
            if (c < '0' || c>'9') {
                return false;

            }
        }
        return  true;
    }
}
