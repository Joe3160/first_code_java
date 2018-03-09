package chapter4.demo421;

public class ReverseArray extends Array {
    public ReverseArray(int len) {
        super(len);
    }

    public int[] getDate() {

        int[] data = super.getData();
        int len = super.getData().length;
        int i = len - 1;
        int[] temp = new int[len];
        for (int item : data) {
            temp[i--] = item;
        }
        //temp赋于data，由于data是引用类型，所以修改了data等于修改了super
        //System.arraycopy(temp, 0, data, 0, len);
        System.arraycopy(temp, 0, super.getData(), 0, len);
        return super.getData();
    }
}
