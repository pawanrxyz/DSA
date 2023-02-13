import java.util.Arrays;
import java.util.Scanner;
public class Array_Sort_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int arr[] = new int[6];
        System.out.println("Insert an elements for arrays:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Before Sorting Elements:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Sorting Elements:");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    
}
