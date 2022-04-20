package oops.double_linklist;

public class DoubleLinkList {
    Node head;

    class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertionDoubleLL(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=node;
            node.prev=curr;
        }

    }
    public void display(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+ " -> ");
            cur=cur.next;
        }
        System.out.println();
    }
}
