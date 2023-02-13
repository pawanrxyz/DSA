import java.util.Arrays;

public class ArrayMinAndMaxSum {
    public static void printArray(int arr[]){
        int sum = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
         for(int i=0;i<arr.length;i++) {
            sum += arr[i];            
         }
         int low_sum = sum-arr.length-1;
         int hig_sum = sum-arr[0];
         System.out.println(low_sum+" "+hig_sum);
    }
    public static void main(String args[]) {
        
        int arr[] = {1,3,5,4,2};
        printArray(arr);

    }
    
}
