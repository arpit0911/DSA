package oops.double_linklist;

import oops.double_linklist.DoubleLinkList.Node;

public class MainDL {
    public static void main(String[] args) {
        callDoubleLL();

    }

    private static void callDoubleLL() {
        DoubleLinkList dl = new DoubleLinkList();
        dl.insertionDoubleLL(10);
        dl.insertionDoubleLL(20);
        dl.insertionDoubleLL(30);
        dl.insertionDoubleLL(40);
        dl.insertionDoubleLL(50);
        dl.display();
        // *reverse double LL
        reverseDLL(dl.head);
        dl.display();
        
    }

    private static void reverseDLL(Node head) {
        Node prev=head.prev;
        Node current=head;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            current.prev=next;
            prev=current;
            current=next;
        }

    }
}
