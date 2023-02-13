public class LL5 {
    public static class Node{
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

    //addlast 
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
    }

    //addMid
    public void addMid(int data,int idx) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        int i = 0;
        Node currNode = head;

        while(i<idx-1) {
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    //printting list

    public void printList() {
        if(head == null) {
            System.out.println("Linkedlist is empty : ");
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
        LL5 list = new LL5();
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        
        list.addLast(3);
        list.printList();

        list.addMid(2,10);
        list.printList();
        System.out.println("The size of linkedlist : "+size);
    }    
}
