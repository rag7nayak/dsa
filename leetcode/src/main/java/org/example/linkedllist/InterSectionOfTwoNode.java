package org.example.linkedllist;

public class InterSectionOfTwoNode {

    public static Node findIntesectiion(Node headA,Node headB){
       int m= findLength(headA);
       int n= findLength(headB);
       Node fp=headA,sp=headB;
       if(m<n){
           for(int i=0;i<n-m;i++){
               sp= sp.next;
           }
       }else {
           for (int i=0;i<m-n;i++){
               fp=fp.next;
           }
       }
       return findSameNode(fp,sp);
    }

    private static Node findSameNode(Node fp, Node sp) {
        while(fp.next!=null && sp.next!=null){
            if(fp==sp){
                return fp;
            }else{
                fp=fp.next;
                sp=sp.next;
            }
        }
        return null;
    }

    private static int findLength(Node head){
        int length=0;
        if(head==null){
            return 0;
        }
        while (head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public static void main(String[] args) {
        System.out.println("test");
        // Create two linked lists that intersect
        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        // First list: 10 -> 20 -> 30 -> 40 -> 50
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = common;

        // Second list: 15 -> 30 -> 40 -> 50
        Node headB = new Node(15);
        headB.next = common;

        InterSectionOfTwoNode obj = new InterSectionOfTwoNode();
        Node intersection = obj.findIntesectiion(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.val);
        } else {
            System.out.println("No intersection found");
        }
    }
}
