package chapter3.lesson17.demo3117;

public class Link {
    private Node root;
    public void  add(String data){
        Node newNode=new Node(data);
        if (root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
    }

    public void print(){
        if (this.root != null) {
            this.root.printNode();
        }
    }

}
