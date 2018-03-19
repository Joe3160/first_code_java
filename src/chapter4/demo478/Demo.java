package chapter4.demo478;

public class Demo {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.add(new Cat("波斯猫", 10));
        shop.add(new Cat("波米拉", 8));
        shop.add(new Dog("哈士其", 10));
        shop.add(new Dog("阿斯加", 7));
        Link all = shop.search("波");
        Object obj[] = all.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

    }
}
