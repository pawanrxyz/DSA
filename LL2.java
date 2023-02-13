// import java.util.Scanner;
public class LL2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFist 
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
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head =  tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //addLast

    public void addMid(int idx,int data) {
        if(head == null) {
            System.out.println("Linkedlist is empty:");
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
         while(i< idx-1) {
            temp = temp.next;  
            i++;         
         }
         newNode.next = temp.next;
         temp.next = newNode;
    }

    //printting linkedList 
    public void printList() {
        if(head == null) {
            System.out.println("LinkedList is empty:");
            return;
        }
         Node temp = head;
         while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
         }
         System.out.println("null");
    }

    //delete node frome list
    //delete list 1st node frome linkedlist

    public void firstdel() {
        if(head == null) {
            System.out.println("LinkedList is empty:");
            return;
        }
        head = head.next;
    }
    
    public static void main(String[] args) {
        LL2 list = new LL2();  
        list.addFirst(2);  
        list.addFirst(1);
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter data for linked list : ");
        // int data = in.nextInt();
        list.printList();
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.addMid(2, 5);
        list.addMid(3,6);
        list.printList();

        list.firstdel();
        list.printList();
        System.out.println("Size of linkedlist is: "+size);
           
    }
    
}
