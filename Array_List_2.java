import java.util.ArrayList;
public class Array_List_2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(list.contains(12));
        list.remove(Integer.valueOf(12));
        System.out.println(list);
        System.out.println(list.get(2));


    }
    
}
