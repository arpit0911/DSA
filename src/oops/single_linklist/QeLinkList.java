package oops.single_linklist;

public class QeLinkList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void inQueue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void deQueue() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Empty Queue");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        QeLinkList qll = new QeLinkList();
        qll.inQueue(2);
        qll.inQueue(3);
        qll.inQueue(4);
        qll.inQueue(5);
        qll.inQueue(6);

        qll.deQueue();
        qll.displayQueue();

    }
}
