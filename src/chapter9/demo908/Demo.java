package chapter9.demo908;

public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("票点");
        //相当于三个售票员在卖同一家店的票
        new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
    }
}
