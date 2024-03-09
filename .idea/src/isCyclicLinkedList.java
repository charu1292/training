package questions;

import static questions.LinkedList.getLinkedList;

public class isCyclicLinkedList {
    public static boolean IsCyclic(LinkedListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        LinkedListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListNode head = getLinkedList();

        if( IsCyclic(head)==true){
            System.out.println("given list is cyclic");
        }
        else System.out.println("given list is not cyclic");


    }
}