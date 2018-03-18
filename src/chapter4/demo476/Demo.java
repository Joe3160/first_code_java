package chapter4.demo476;

public class Demo {
    public static void main(String[] args) {
        Link all=new Link();
        all.add("A");
        all.add("B");
        all.add("C");
        all.add("D");

        System.out.println(all.size());
        
        Object[] data=all.toArray();
        print(data);

        System.out.println();
        System.out.println("--------------");
        all.remove("D");
        System.out.println(all.size());
        print(all.toArray());




    }

    private static void print(Object[] objects){
        for (int i = 0; i <objects.length ; i++) {
            String s=(String) objects[i];
            System.out.print(s+",");
        }

    }
}
