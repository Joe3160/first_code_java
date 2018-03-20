package chapter5.demo521;

public class Sex {
    private String title;
    private static final Sex MALE = new Sex("男");
    private static final Sex FEMALE = new Sex("女");


    private Sex(String title) {//私有化
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public static Sex getInstance(String ch) {
        switch (ch) {
            case "man":
                return MALE;
            case "woman":
                return FEMALE;
            default:
                return null;
        }
    }
}
