import java.util.ArrayList;

public class Array_List_1 {
    public static void main(String [] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(Integer.valueOf(2));
        System.out.println(list);
        list.get(1);
        System.out.println(list);
        list.set(1,2);
        System.out.println(list);
        //list.clear();
        //System.out.println(list);
        ArrayList<Integer>newList = new ArrayList<>();
        newList.add(23);
        newList.add(24);
        newList.add(26);
        newList.add(28);
        newList.contains(2);
        System.out.println(newList);
        System.out.println(newList);
        list.addAll(newList);
        System.out.println(list);
        // System.out.println(newList);
        
    }    
}
