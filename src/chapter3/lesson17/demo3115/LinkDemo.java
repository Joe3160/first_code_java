package chapter3.lesson17.demo3115;

import chapter3.lesson17.demo3114.Node;

public class LinkDemo {
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n1 = new Node("车箱A");
        Node n2 = new Node("车箱B");
        root.setNext(n1);
        n1.setNext(n2);
        Node currentNode=root;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }

    }
}
