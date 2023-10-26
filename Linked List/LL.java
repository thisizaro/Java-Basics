public class LL {
    

    Node head;
    private int size;



    LL(){
        size = 0;
    }

    public class Node {
        String data;

        Node next;


        Node(String data){
            this.data = data;
            this.next = null;

            size++;

        }
    }



    public void addFirst(String data){
        Node p = new Node(data);
        p.next = head;
        head = p;
        System.out.println("Added at First");
    }


    public void addLast(String data){
        Node p = new Node(data);

        if(head == null)
        {
            head = p;
            return;
        }

        Node q = head;

        while(q.next != null)
        {
            q = q.next;
        }

        q.next = p;


        System.out.println("Added at Last");
    }

    public void printList(){
        System.out.println("Present list: ");
        Node q = head;

        int i = 0;
        while(q != null)
        {
            System.out.println(i + "  --->  " + q.data);
            q = q.next;
            i++;
        }
    }

    public void removeFirst(){
        if(head == null)
        {
            System.out.println("Empty list nothing to delete");
            return;
        }

        head = head.next;
        size--;
        System.out.println("First element removed");
    }

    public void removeLast(){
        if(head == null )
        {
            System.out.println("Empty list nothing to delete");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 

        Node q = head;
        while((q.next).next != null){
            q = q.next;
        }

        q.next = null;

        System.out.println("remove Last");
    }


    public int getSize() {
        return size;
    }

    public static void main(String args[]){
        LL list = new LL();

        for(int i = 0; i < 3; i++)
        {
            list.addLast(""+(i+1));
        }
        list.printList();
        // list.addInMiddle(4, "cat");
        // System.out.println(list.getSize());
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        list.reverseList();
        list.printList();


    }

    public void addInMiddle(int index, String data){
        if(index>size)
        {
            System.out.println("Index out of range.");
            return;
        }
        Node p = new Node(data);
        Node q = head;

        int i = 0;
        while(q.next !=null && i != index)
        {
            q = q.next;
            i++;
        }
        p.next = q.next;
        q.next = p;
        System.out.println("Added in middle.");
    }

    public void reverseList()
    {
        if (head == null)
        {
            System.out.println("There is no data");
            return;
        } 

        Node p = head.next;
        head.next = null;
        Node q = head;
        

        while(p !=null)
        {
            head = p;
            p = p.next;
            head.next = q;
            q = head;
        }

        System.out.println("list reversed");
    }

}