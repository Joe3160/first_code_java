package chapter4.demo478;

public class Cat implements Pet {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Cat)) {
            return false;
        }

        Cat cat = (Cat) obj;
        if (this.name.equals(cat.name) && this.age == cat.age) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "猫的名字：" + this.name + "，年龄：" + this.age;
    }
}
