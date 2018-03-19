package chapter4.demo478;

public class Dog implements Pet {
    private String name;
    private int age;

    public Dog(String name, int age) {
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

        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog dog = (Dog) obj;
        if (this.name.equals(dog.name) && this.age == dog.age) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "狗的名字：" + this.name + "，年龄：" + this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
