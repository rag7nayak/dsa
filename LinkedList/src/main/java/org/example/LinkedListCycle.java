package org.example;

public class LinkedListCycle {

    private static boolean findLinkedListCycle(Node head){
        Node sp=head,fp=head;
            while(sp!=null && fp!=null && fp.next.next!=null) {
                sp = sp.next;
                fp = fp.next.next;

                if (sp == fp) {
                    return true;
                }
            }
          return false;
    }
    public static void main(String[] args) {
        // Case 1: List with NO cycle
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        System.out.println("List 1 has cycle? " + findLinkedListCycle(head1)); // Expected: false

        // Case 2: List WITH cycle
        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);

        // Create cycle: last node points back to second node
        head2.next.next.next.next = head2.next;

        System.out.println("List 2 has cycle? " + findLinkedListCycle(head2)); // Expected: true
    }

}
