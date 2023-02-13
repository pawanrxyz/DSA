import java.util.ArrayList;

public class ArrayList_p {
    public static void main(String [] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        // list.get(1);
        System.out.println(list.get(3));
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list.remove(Integer.valueOf(7));
        System.out.println(list);

        System.out.println(list1);
        System.out.println(list.contains(4));
        System.out.println(list1.contains(4));
        // Queue<Integer> que = new Queue<>();
    }    
}
