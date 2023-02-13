import java.util.Arrays;
import java.util.Scanner;
public class ReturnSmalestAndLargest {
    public static int[] printArray(int arr[]) {
        Arrays.sort(arr);
        int []ans = {arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements of an array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int [] ans = printArray(arr);
        System.out.println("Smallest "+ans[0]);
        System.out.println("Largest "+ans[1]);
        sc.close();

    }    
}
