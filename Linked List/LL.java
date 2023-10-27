public class LL {

    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;

        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

            size++;

        }
    }

    public void addFirst(String data) {
        Node p = new Node(data);
        p.next = head;
        head = p;
        System.out.println("Added at First");
    }

    public void addLast(String data) {
        Node p = new Node(data);

        if (head == null) {
            head = p;
            return;
        }

        Node q = head;

        while (q.next != null) {
            q = q.next;
        }

        q.next = p;

        System.out.println("Added at Last");
    }

    public void printList() {
        System.out.println("Present list: ");
        Node q = head;

        int i = 0;
        while (q != null) {
            System.out.println(i + "  --->  " + q.data);
            q = q.next;
            i++;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list nothing to delete");
            return;
        }

        head = head.next;
        size--;
        System.out.println("First element removed");
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node q = head;
        while ((q.next).next != null) {
            q = q.next;
        }

        q.next = null;

        System.out.println("remove Last");
    }

    public int getSize() {
        return size;
    }

    public void addInMiddle(int index, String data) {
        if (index > size) {
            System.out.println("Index out of range.");
            return;
        }
        Node p = new Node(data);
        Node q = head;

        int i = 0;
        while (q.next != null && i != index) {
            q = q.next;
            i++;
        }
        p.next = q.next;
        q.next = p;
        System.out.println("Added in middle.");
    }

    public Node reverseList(Node head) {
        if (head == null) {
            System.out.println("There is no data");
            return;
        }

        Node p = head.next;
        head.next = null;
        Node q = head;

        while (p != null) {
            head = p;
            p = p.next;
            head.next = q;
            q = head;
        }
        
        return head;

        System.out.println("list reversed");
    }

    public void removeNthFromEnd(int n)
    {
        if(head.next == null)
        {
            return;
        }

        int s = 0;
        Node q = head;

        while(q != null)
        {
            q = q.next;
            s++;
        }
        
        q = head;
        for(int i = 0; i < s-n-1 ; i++)
        {
            q = q.next;
        }
        q.next = (q.next).next;
    }


    public static void main(String args[]) {
        LL list = new LL();

        for (int i = 0; i < 1; i++) {
            list.addLast("" + (i + 1));
        }
        list.printList();
        list.removeNthFromEnd(4);
        list.printList();
        // list.addInMiddle(4, "cat");
        // System.out.println(list.getSize());
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();
        // list.reverseList();
        // list.printList();

    }

    public boolean isPalindrome(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        
        Node middleNode = findMiddleNode(head);
        Node newHead = reverseList(middleNode.next);
        Node p = head;
        Node q = newHead;
        while(q != null)
        {
            if(q.data !=p.data)
            {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return(true);
    }

    public Node findMiddleNode(Node head)
    { 
        //Incomplete function
        //H and T algo
        return head;
    }
}