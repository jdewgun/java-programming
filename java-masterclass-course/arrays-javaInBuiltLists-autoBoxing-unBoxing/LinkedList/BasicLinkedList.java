package LinkedList;

/**
 * Main
 */
public class BasicLinkedList {

    private Node head;

    private int size;

    public BasicLinkedList() {
        this.head = new Node(0);
        this.size = 0;
    }

    public BasicLinkedList(Node headVal, int sizeVal) {
        this.head = headVal;
        this.size = sizeVal;
    }

    public void addHead(int headVal) {
        insertNth(headVal, 0);
    }

    public void insert(int insertVal) {
        insertNth(insertVal, this.size);
    }

    public void insertNth(int insertVal, int position) {
        checkBounds(position, 0, this.size);

        Node cur = head;

        for (int i = 0; i < position; i++) {
            cur = cur.next;
        }

        Node newNode = new Node(insertVal);
        newNode.next = cur.next;
        cur.next = newNode;
        this.size++;
    }

    public void insertSorted(int insertVal) {
        Node cur = this.head;

        while (cur.next != null && insertVal > cur.next.nodeVal) {
            cur = cur.next;
        }

        Node newNode = new Node(insertVal);
        newNode.next = cur.next;
        cur.next = newNode;
        this.size++;
    }

    public void deleteHead() {
        deleteNth(0);
    }

    public void delete() {
        deleteNth(this.size - 1);
    }

    public void deleteNth(int position) {
        checkBounds(position, 0, this.size);

        Node cur = head;

        for (int i = 0; i < position; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        this.size--;
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            System.out.println("Position Value out of bounds");
            return;
        }
    }

    public void clearList() {
        if (this.size == 0) {
            return;
        }

        Node previousNode = head.next;
        Node cur = previousNode.next;

        while (cur != null) {
            previousNode = null;
            previousNode = cur;
            cur = cur.next;
        }

        previousNode = null;
        head.next = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String toString() {
        if (this.size == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        Node cur = this.head.next;
        while (cur != null) {
            builder.append(cur.nodeVal).append("->");
            cur = cur.next;
        }

        return builder.replace(builder.length() - 2, builder.length(), "").toString();
    }

    public static void main(String[] args) {
        BasicLinkedList myList = new BasicLinkedList();

        assert myList.isEmpty();
        myList.addHead(5);
        myList.addHead(7);
        myList.addHead(10);
        System.out.println(myList.toString());
        myList.deleteHead();
        myList.toString();

        myList.insertNth(11, 2);
        System.out.println(myList.toString());

        myList.deleteNth(1);
        System.out.println(myList.toString());

        myList.clearList();
        myList.isEmpty();
        System.out.println(myList.toString());

    }
}