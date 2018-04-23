package chapter8.demo831;

public enum Color {
    RED("红色"), GREEN("绿色"), YELLOW("黄色");
    private String title;

    private Color(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
