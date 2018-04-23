package chapter9.demo907;

public class Ticket extends Thread {
    private int num = 5;
    private String name;

    public Ticket(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (this.num > 0) {
                System.out.println(this.name+"卖出1张，剩余" + (--this.num));
            }else {
                return;
            }

        }
    }
}
