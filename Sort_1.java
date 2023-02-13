import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Sort_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        System.out.println("Enter 5 integer:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int temp = sc.nextInt();
            if(!list.contains(temp))
            list.add(temp);
        }
        Collections.sort(list);
        System.out.println(list);
        sc.close();
    }
    
}
