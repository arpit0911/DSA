package oops;

public class LinkList {
    /**
     * Node
     */
    // * for creating a node
    public class Node {

        int data; // * for data in the linkList
        Node next; // * to store the reference of next node

        public Node(int data) { // *constructor to add new element in the node
            this.data = data;
        }
    }

    // int size; //! can be used for maintaining the size of the linklist
    Node head;

    // * for adding a new node at the end of the linkList
    public void add(int data) {
        Node node = new Node(data); // * creating new node
        Node i = head; // * another variable for traversing the linklist

        // * if no node is available in linklist(empty LinkList)
        if (head == null) {
            head = node;
            // node.next = null;
        } else { // * for non-empty LinkList
            while (i.next != null) { // * travesing to the last node
                i = i.next;
            }
            i.next = node;
            // node.next = null;
        }

    }

    // * removing a node from the end of the LinkList
    public void remove() {
        // * if there is atleast one node in linklist
        if (head != null) {
            // * if there is more then one node in linklist
            if (head.next != null) {
                Node i = head;
                Node j = head.next;
                while (j.next != null) {
                    i = j;
                    j = j.next;
                }
                i.next = null;
            } else { // * if there is only one node
                head = null;
            }
        }
    }

    // * to add before first node
    public void addAtFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    // * to remove the first node
    public void removeFirstNode() {
        if (head != null) {
            head = head.next;
        }
    }

    // * to update the data at index
    public void updateNode(int index, int data) {
        int count = 0;
        int size = getSize();
        // System.out.println("size= " + size );
        if (index < size) {
            if (head != null) {
                Node i = head;
                while (i != null) {
                    if (count == index) {
                        i.data = data;
                        break;
                    } else {
                        i = i.next;
                        count++;
                    }
                }
            }
        } else {
            System.out.println("Can't update index " + index);
        }

    }

    // * to get the size of the linklist
    private int getSize() {
        int counter = 0;
        Node i = head;
        while (i != null) {
            i = i.next;
            counter++;
        }

        return counter;
    }

    // * add one to linkList
    public void addOne() {
        Node i = head.next;
        head.data += 1;
        int carry = head.data / 10;
        head.data %= 10;
        while (i.next != null) {
            if (carry > 0) {
                i.data += carry;
                carry = i.data / 10;
                i.data %= 10;
            }
            i = i.next;
        }
        i.data += carry;

    }

    // * to display the LinkList
    public void display() {
        Node i = head;
        while (i != null) {
            System.out.print(i.data + " -> ");
            i = i.next;
        }
        System.out.println("null");
    }

    // * main method can be implemented in other class
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        // ll.add(10);
        // ll.display();
        // ll.add(101);
        // ll.display();
        // ll.add(106);
        // ll.display();
        // ll.add(102);
        // ll.display();
        // ll.remove();
        // ll.display();
        // ll.remove();
        // ll.display();
        // ll.remove();
        // ll.display();
        // ll.remove();
        // ll.display();
        ll.addAtFirst(1);
        ll.display();
        ll.addAtFirst(2);
        ll.display();
        ll.addAtFirst(3);
        ll.display();
        ll.addAtFirst(9);
        ll.display();
        // ll.removeFirstNode();
        // ll.display();
        // ll.removeFirstNode();
        // ll.display();
        // ll.removeFirstNode();
        // ll.display();
        // ll.removeFirstNode();
        // ll.display();
        ll.updateNode(4, 500);
        ll.display();
        ll.addOne();
        ll.display();

    }
}
