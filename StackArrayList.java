import java.util.ArrayList;
public class StackArrayList {
    static class Stact {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean siEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek() {
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();  
              
    }
    
}
