package chapter4.demo476;

public class Link {
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        /**
         * 设置新节点，所有新节点保存在最后一个节点之后
         * @param node 新的节点对象
         */
        public boolean addNode(Node node) {
            if (this.next == null) {//当前下个节点为null
                this.next = node;
                return true;
            } else {
                return this.next.addNode(node);
            }
        }

        /**
         * 检索要查询的数据是否存在
         * @param data
         * @return
         */
        public boolean containsNode(Object data) {
            if (data.equals(this.data)) {//当前节点的数据为要查询的数据
                return true;
            }
            if (this.next == null) {//没后续节点了
                return false;
            }
            return this.next.containsNode(data);//递归调用继续查询
        }

        /**
         * 根据索引取出数据
         * @param index
         * @return
         */
        public Object getNode(int index) {
            if (Link.this.foot++ == index) {
                return this.data;
            }
            return this.next.getNode(index);
        }

        public boolean setNode(int index, Object data) {
            if (Link.this.foot++ == index) {
                this.data = data;
                return true;
            } else {
                return this.next.setNode(index, data);
            }
        }

        public boolean removeNode(Node previous, Object data) {
            if (data.equals(this.data)) {//当前节点为要删除的节点
                previous.next = this.next;
                this.next = null;//断开原有的连接
                return true;
            }
            return this.next.removeNode(this, data);
        }

        public void toArrayNode() {
            Link.this.arr[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }


    }

    private Node root;//定义根节点
    private int count;//保存无素个数
    private int foot = 0;//节点索引
    private Object[] arr;//返回数组

    public void add(Object data) {
        if (data == null) {
            return;
        }
        Node node = new Node(data);
        if (this.root == null) {//当前没有节点
            this.root = node;
        } else {
            this.root.addNode(node);
        }
        this.count++;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean contains(Object data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    public Object get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;//从头开始
        return this.root.getNode(index);
    }

    public boolean set(int index, Object data) {
        if (index > this.count) {
            return false;
        }
        this.foot = 0;
        return this.root.setNode(index, data);
    }

    public boolean remove(Object data) {
        if (!this.contains(data)) {
            return false;
        }

        if (data.equals(this.root.data)) {//要删除的数据为根节点的数据
            this.root = this.root.next;
            this.count--;
            return true;
        } else {
            this.count--;
            return this.root.next.removeNode(this.root, data);
        }
    }

    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.arr = new Object[this.count];
        this.root.toArrayNode();
        return this.arr;
    }

    public void clear() {
        this.root = null;
    }
}
