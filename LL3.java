public class LL3 {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //  Addfirst 
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //addinLast

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null)  {
            head = tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
    }

    ///addinMid

    public void addMid(int idx,int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        Node currNode = head;
        int i = 0;
         
        while(i<idx-1) {
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    //deleteFirst
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The LinkedLiest is empty : ");
            return;
        }
        head = head.next;
    }

    // deleteLast
    public void deleteLast() {
        if(head == null) {
            System.out.println("The linkedlist is empty: ");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //printting lisnkedlist

    public void printList() {
        if(head == null) {
            System.out.println("Linkedlist is empety: ");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]) {
        LL3 list = new LL3();
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.addLast(4);
        list.addLast(3);
        list.printList();

        list.addMid(4,5);
        list.printList();

        System.out.println("After deleting first node: ");
        // list.deleteFirst();
        // list.printList();

        System.out.println("After deleting last node ");
        list.deleteLast();
        list.printList();
        System.out.println("The total size of linkedlist is : "+size);
    }    
}
