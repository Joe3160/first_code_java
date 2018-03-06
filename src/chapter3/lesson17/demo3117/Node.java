package chapter3.lesson17.demo3117;

public class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * 添加新的节点
     * @param newNode
     */
    public void addNode(Node newNode) {
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.addNode(newNode);
        }
    }



    public void printNode(){
        System.out.println(this.data);
        if (this.next.getData()!=null) {
           this.next.printNode();
        }
    }
}
