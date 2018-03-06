package chapter3.lesson17.demo3115;

import chapter3.lesson17.demo3114.Node;

public class LinkDemo2 {
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n1 = new Node("车箱A");
        Node n2 = new Node("车箱B");
        root.setNext(n1);
        n1.setNext(n2);
        print(root);


    }

    /**
     * 递归
     * @param current
     */
    public static void print(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.getData());
        print(current.getNext());
    }
}