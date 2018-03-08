package chapter4.demo42;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setSchool("清华大学");
        System.out.println(
                "姓名：" + student.getName() +
                        "，年龄：" + student.getAge() +
                        "，学校：" + student.getSchool()
        );
    }
}
