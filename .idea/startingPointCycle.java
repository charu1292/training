package questions;

import static questions.LinkedList.getLinkedList;

public class startingPointCycle {

    public static int startingPointCycle(LinkedListNode head) {
        if (head == null || head.next == null) {
            return -1;
        } else {
            LinkedListNode fast, slow;
            fast = slow = head;
            boolean isCyclic = false;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    isCyclic = true;
                    break;
                }
            }

            if(isCyclic) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.data;
            }
            return -1;
        }
    }

        public static void main(String[] args) {
            LinkedListNode head = getLinkedList();

                int c= startingPointCycle(head);
                if(c==-1){
                    System.out.println("Given link is not cyclic");
                }
              else
            System.out.println("given list is cyclic and " + c);


        }
    }


