package chapter6.demo618;

public class People {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("年龄不能小于0");
        }
        this.age = age;
    }
}
