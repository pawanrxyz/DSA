public class LLPractice {
    public static class Node {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print ll
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // addmid or index
    public void addmid(int idx, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove node Fist

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // RemoveLast
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }

    // SearchNode oor key what is indexx of key or Node
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // reverse linkedlist
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            head = prev;
        }
    }

    // Delete Nth element from linkList end
    public void deleteNthFromend(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // ckeck linllist palindrom or not
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom() {
        if (head == null && head.next == null) {
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // check lef and right half

        while (right != null) {
            if (left.data != right.data) { // compaire
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LLPractice ll = new LLPractice();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addmid(4, 5);
        // ll.print();
        // System.out.println(size);

        // ll.reverse();
        // ll.print();

        // call removeFisrt
        // ll.removeFirst();
        // ll.print();

        // call removeLast
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // call itrSearch
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));

        // delete from nth node from end
        // ll.print();
        // ll.deleteNthFromend(3);
        // ll.print();

        // add last for palindrome linkllist check
        ll.addLast(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(1);
        ll.print();
        // ll.checkPalindrom();

        System.out.println(ll.checkPalindrom());
        // ll.print();

    }
}
