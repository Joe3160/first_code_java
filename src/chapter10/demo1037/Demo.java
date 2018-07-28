package chapter10.demo1037;

public class Demo {
    public static void main(String[] args) {
        String str="H@e#l%lo%%8899W~o r+l+d";
        String regex="[^a-zA-Z]";
        String str2=str.replaceAll(regex,"");
        System.out.println(str2);

    }
}
