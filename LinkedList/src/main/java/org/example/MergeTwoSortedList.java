package org.example;

public class MergeTwoSortedList {
    private static Node mergeTwoNode(Node headA,Node headB){
        Node head=null,tail=null;
        Node fp=headA,sp=headB,nodeTobeCopied=null;
        while (fp!=null || sp!=null){
            if(sp!=null && fp!=null){
                if(sp.val<=fp.val){
                    nodeTobeCopied=sp;
                    sp=sp.next;
                }else {
                    nodeTobeCopied=fp;
                    fp=fp.next;
                }
            }
            else if(fp!=null){
                nodeTobeCopied=fp;
                fp=fp.next;
            }else {
                nodeTobeCopied=sp;
                sp=sp.next;
            }
            tail= inserAtEnd(tail,nodeTobeCopied.val);
            if(head==null){
                head=tail;
            }
        }
       return head;
    }

    private static Node inserAtEnd(Node tail, int val) {
        Node newNode = new Node(val);
        if(tail!=null){
            tail.next=newNode;
        }
return newNode;
    }
    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 5
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(5);

        // Second sorted list: 2 -> 4 -> 6
        Node headB = new Node(2);
        headB.next = new Node(4);
        headB.next.next = new Node(6);

        // Merge them
        Node merged = mergeTwoNode(headA, headB);

        // Print result
        System.out.print("Merged List: ");
        printList(merged);
    }

}
