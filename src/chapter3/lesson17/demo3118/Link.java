package chapter3.lesson17.demo3118;

public class Link {
    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }


        public boolean containsNode(String data) {
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(data);
                } else {
                    return false;
                }
            }
        }

        public String getNode(int index) {
            if (Link.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, String data) {
            if (Link.this.foot++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }


        /**
         * 删除非根节点
         * @param previous
         * @param data
         */
        public void removeNode(Node previous, String data) {
            if (data.equals(this.data)) {//当前的节点为要删除的节点
                previous.next = this.next;
                this.next = null;//断开当前节点与下个节点连接
            } else {
                this.next.removeNode(this, data);//继续判下一个节点
            }
        }

        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();//继续下个节点
            }
        }


    }

    private Node root;//根节点
    private int count;//计数
    private int foot;//索引
    private String[] retArray;//返回数组

    public void add(String data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;//创建根节点
        } else {
            this.root.addNode(newNode);//不是根节点，则在根节点后添加一个节点
        }
        this.count++;//计数
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(String data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    public String get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;//重置为0，避免多次查询后查询起始位置异常
        return this.root.getNode(index);
    }

    public void set(int index, String data) {
        if (index > this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }

    public void remove(String data) {
        if (!this.contains(data)) {
            return;
        }

        //判断要删除的节点是否为当前根节点的数据
        if (data.equals(this.root.data)) {
            this.root = this.root.next;
            this.root.next = null;//删除原根节点的链接
        } else {
            this.root.next.removeNode(this.root, data);
        }
        this.count--;
    }

    /**
     * 转为数组
     * @return String[]
     */
    public String[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;//重置起始位置
        this.retArray = new String[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    public void clear() {
        this.root = null;
        this.count = 0;
    }
}
