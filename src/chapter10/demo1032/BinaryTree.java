package chapter10.demo1032;

@SuppressWarnings("rawtypes")
public class BinaryTree {
    private class Node {
        private Comparable data;
        private Node lef;
        private Node right;

        @SuppressWarnings("unused")
        public Node(Comparable data) {
            this.data = data;
        }

        @SuppressWarnings("unchecked")
        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode) > 0) {
                if (null == this.lef) {
                    this.lef = newNode;
                } else {
                    this.lef.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode() {
            if (this.lef != null) {
                this.lef.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode();
            }
        }
    }

    private Node root;
    private int count;
    private Object[] retData;
    private int foot;

    public void add(Object obj) {
        Comparable com = (Comparable) obj;
        //System.out.println(com);
        Node newNode = new Node(com);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retData = new Object[this.count];
        this.root.toArrayNode();
        return this.retData;
    }


}
