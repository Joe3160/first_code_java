package chapter4.demo446;

public abstract class Action {
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 7;

    public void command(int cmd) {
        switch (cmd) {
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + WORK:
                this.eat();
                this.work();
                break;
            case EAT + SLEEP:
                this.eat();
                this.sleep();
                break;
            case WORK + SLEEP:
                this.work();
                this.sleep();
                break;
            case EAT + SLEEP + WORK:
                this.eat();
                this.work();
                this.sleep();
                break;
        }


    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void work();

}
