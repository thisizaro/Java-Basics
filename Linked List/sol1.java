import java.util.*;


public class sol1 {
    
    //   Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode findMiddle(ListNode head)
    {

    }

    public boolean isPalindrome(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        ListNode middleNode = findMiddle(head);
    }
    public static void main(String args[])
    {
        LinkedList<int> list = new LinkedList<int>();

    }
}
