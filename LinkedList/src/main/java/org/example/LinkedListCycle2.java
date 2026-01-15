package org.example;

public class LinkedListCycle2 {

    private static Node findCycle(Node head){
        Node slow=head,fast=head;
        if(head==null||head.next==null){
            return null;
        }
        while(true){
            if(slow==null||fast==null||fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Node third=head;
                while(third!=fast){
                    third=third.next;
                    fast=fast.next;
                }
            return third;
            }
        }
    }


    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Link nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create a cycle: fifth -> third
        fifth.next = third;

        // Call your function
        Node cycleStart = findCycle(head);

        // Print result
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }


}
