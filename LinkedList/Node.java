package LinkedList;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
};