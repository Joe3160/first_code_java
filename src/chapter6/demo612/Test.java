package chapter6.demo612;

public class Test {
    public static void main(String[] args) {
        String s= "q123";
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
