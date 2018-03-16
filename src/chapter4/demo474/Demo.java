package chapter4.demo474;

public class Demo {
    public static void main(String[] args) {
        Object obj=new int[]{1,2,3};
        System.out.println(obj);
        if (obj instanceof int[]) {
            int[] data=(int[])obj;
            for (int i:data) {
                System.out.print(i+"、");
            }
        }
    }
}
