package chapter6.demo612;

public class People {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("年龄不能小于0");
        }
        this.age = age;
    }
}
