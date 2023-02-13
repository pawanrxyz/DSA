import java.util.ArrayList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(53);
        list.add(12);
        System.out.println(list);
        list.set(2,122);
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list. remove(Integer.valueOf(24)));
    }
}