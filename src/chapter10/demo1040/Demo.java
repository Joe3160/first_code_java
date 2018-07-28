package chapter10.demo1040;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //验证IP格式及有效性 192.168.1.1
        String ip = "192.168.0.1";
        System.out.println(ip);
        String regex = "^(\\d{1,3}\\.){3}(\\d{1,3})$";
        if (ip.matches(regex)) {
            System.out.println("ip格式正确");
            String[] temp = ip.split("\\.");
            //System.out.println(Arrays.toString(temp));
            boolean flag = true;
            for (String value : temp) {
                int v = Integer.parseInt(value);
                //System.out.println(v);
                if (v > 255 || v < 0) {
                    flag = false;
                    //System.out.println("ip无效");
                    break;
                }
            }
            if (flag) {
                System.out.println("ip有效");
            } else {
                System.out.println("ip无效");
            }

        } else {
            System.out.println("ip格式错误");
        }
    }
}
