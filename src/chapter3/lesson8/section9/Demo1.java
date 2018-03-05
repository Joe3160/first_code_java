package chapter3.lesson8.section9;

public class Demo1 {
    public static void main(String[] args) {
        String str="hello";
        //charAt()取出指定索引的字符
        char c=str.charAt(0);//截取第一个字符
        System.out.println(c);
        //toCharArray()

        System.out.println("-----toCharArray--------");

        char[] data=str.toCharArray();
        for (char x : data) {
            System.out.print(x+",");
        }
        System.out.println();



    }
}
