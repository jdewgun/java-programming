package LinkedList;

/**
 * Node
 */
public class Node {

    int nodeVal;
    Node next;

    public Node() {
        // Empty Constructor
    }

    public Node(int value) {
        this(value, null);
    }

    public Node(int value, Node nextNode) {
        this.nodeVal = value;
        this.next = nextNode;
    }

}