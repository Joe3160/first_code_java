package chapter3.lesson17.demo3118;

public class Demo {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("Hello");
        link.add("World");
        link.add("你好");
        link.add("世界");
        System.out.println("size:"+link.size());
        System.out.println("isEmpty:"+link.isEmpty());
        System.out.println("contains \"hello\":"+link.contains("Hello"));
        System.out.println("contains \"Hi\":"+link.contains("Hi"));

        System.out.println("--------------------------");
        for (int i=0;i<link.size();i++) {
            System.out.println("index "+i+":"+link.get(i));
        }
        System.out.println("--------------------------");

        link.set(1,"world !");
        link.set(3,"世界 ！");
        for (int i=0;i<link.size();i++) {
            System.out.println("index "+i+":"+link.get(i));
        }
        System.out.println("--------------------------");
        link.remove("世界 ！");
        System.out.println("链表长度："+link.size());
        for (int i=0;i<link.size();i++) {
            System.out.println("index "+i+":"+link.get(i));
        }
        System.out.println("--------------------------");

        String[] link_arr=link.toArray();
        for (String str:link_arr ) {
            System.out.println(str);
        }

        link.clear();




    }
}
