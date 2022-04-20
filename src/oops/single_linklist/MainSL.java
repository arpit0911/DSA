package oops.single_linklist;


import oops.single_linklist.SingalLinkList.Node;

public class MainSL {
   
    public static void main(String[] args) {
        // Mobile iPhone=new Mobile(24, 256, "iPhone 13", "ISO");
        callLinkList();

    }

    

    private static void callLinkList() {
        SingalLinkList list1 = new SingalLinkList();
        SingalLinkList list2 = new SingalLinkList();
        // *add
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        // list2.add(6);
        // list2.add(7);
        // list2.add(8);
        // list2.add(9);
        // list2.add(10);
        list1.display();
        // list2.display();
        // * sum of two linklist
        // addTwoLinkList(list1.head, list2.head);
        // *nth node from end
        int n = 3;
        nthNode(list1.head, n);

        // mergTwoLinkList(list1.head, list2.head);
        list1.display();

        // System.out.println(list1.head.data);
        // System.out.println(list2.head.data);
        // *remove
        // list1.remove(); list1.display();
        // list1.remove(); list1.display();
        // list1.remove(); list1.display();
        // list1.remove(); list1.display();
        // *addAtFront
        // list1.addAtFirst(1); list1.display();
        // list1.addAtFirst(2); list1.display();
        // list1.addAtFirst(3); list1.display();
        // list1.addAtFirst(9); list1.display();
        // *removeFromFront
        // list1.removeFirstNode(); list1.display();
        // list1.removeFirstNode(); list1.display();
        // list1.removeFirstNode(); list1.display();
        // list1.removeFirstNode(); list1.display();
        // *update
        // list1.updateNode(4, 500); list1.display();
        // *add one to list
        // list1.addOne();
        // list1.display();
    }

    // * nth node from the end of the link list
    private static void nthNode(Node head, int n) {
        Node s = head;
        Node f = head;
        while (n > 1) {
            f=f.next;
            n--;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        System.out.println("from last is = "+ s.data);
    }

    // *function to merge two sorted linklist

    // private static void mergTwoLinkList(Node head1, Node head2) {
    //     Node i = head1;
    //     Node j = head2;
    //     Node k =head1;
        
    //     while (i != null && j != null) {
    //         if (i.data <= j.data) {
    //             k.next=i;
    //             k=k.next;
    //             i = i.next;
    //         } else {
    //             k.next=j;
    //             k=k.next;
    //             j = j.next;
    //         }
    //     }
    //     while(i!=null){
            
    //     }

    // }

    // * function to add two linklist
    private static void addTwoLinkList(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node k = head1;
        int sum, carry = 0;

        while (i != null || j != null) {
            sum = 0;
            if (i != null) {
                sum += i.data;
                i = i.next;
            }
            if (j != null) {
                sum += j.data;
                j = j.next;
            }
            sum += carry;
            carry = sum / 10;
            int lastDigit = sum % 10;
            if (i != null) {
                k.data = lastDigit;
                k = k.next;
            } else if (j != null) {
                k.data = lastDigit;
                k.next = j;
                k = j;
            } else {
                k.data = sum;
            }
        }

    }
}
