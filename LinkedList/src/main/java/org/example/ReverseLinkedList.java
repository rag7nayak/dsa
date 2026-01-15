package org.example;

public class ReverseLinkedList {
    Node newHead = null;
    private Node reverseNode(Node head){
        if(head!=null) {
            Node last = reverse(head);
            last.next=null;//break the old link
        }
return newHead;
    }

    private Node reverse(Node node) {

        if(node.next==null){
            newHead= node;
            return node;
        }else {
            Node last= reverse(node.next);
            last.next=node;
            return node;
        }
    }
    // Utility to print a linked list
    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        // Reverse the list
        ReverseLinkedList obj = new ReverseLinkedList();
        Node reversed = obj.reverseNode(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }

}
