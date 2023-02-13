import java.util.Scanner;
public class InsertAnArray {
    public static void main(String[] args) {
        // int arr[] = {1,3,4,5,6};
        // int s = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array : ");

        int n = in.nextInt();
        int arr[] = new int [n+1];
        System.out.println("Enter "+n+" elements of an array: ");        
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
         System.out.println("Enter position of an array:  ");
         int pos = in.nextInt();

         System.out.println("Enter item that we want ti enter : ");
         int item = in.nextInt();

         for(int i=arr.length-1;i>pos;i--) {
            arr[i] = arr[i-1];
         }
        //  int arr[] = new int[n+1];
         arr[pos] = item;
        //  s++;
         for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
         }
         
         
         in.close();
     }
}
