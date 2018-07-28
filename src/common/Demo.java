package common;

public class Demo {
    public static <T> void dump(T t) {
        if (t instanceof String) {
            System.out.println("string(" + ((String) t).length() + ")" + "\"" + t + "\"");
        } else if (t instanceof Character) {
            System.out.println("char(1)" + t);
        } else if (t instanceof Byte) {
            System.out.println("byte(1)" + t);
        } else if (t instanceof Boolean) {
            System.out.println("bool(" + t + ")");
        } else if (t instanceof Short) {
            System.out.println("short(" + t + ")");
        } else if (t instanceof Integer) {
            System.out.println("int(" + t + ")");
        } else if (t instanceof Float) {
            System.out.println("float(" + t + ")");
        } else if (t instanceof Double) {
            System.out.println("double(" + t + ")");
        } else {
            System.out.println("object:" + t.toString());
        }
    }


}